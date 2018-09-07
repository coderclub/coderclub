package connectMongoDB;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.connection.*;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

public class connectToMongoDB {
    public static MongoDatabase mongoDatabase = null;

    public static MongoDatabase connectToMongoDB() {
        MongoClient mongoClient = new MongoClient();
        mongoDatabase = mongoClient.getDatabase("STUDENTS");
        System.out.println("Database Connected");

        return mongoDatabase;
    }

    public static String insertToMongoDB(User user) {
        String profile = user.getStName();
        MongoDatabase mongoDatabase1 = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase1.getCollection("profile");
        Document document = new Document().append("stName", user.getStName()).append("stID", user.getStID()).
                append("stDOB", user.getStDOB());
        collection.insertOne(document);
        return profile + " has been registered";
    }

    public static List<User> readFromMongoDB() {
        List<User> list = new ArrayList<User>();
        User user = new User();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection("profile");
        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);
        for (Document doc : iterable) {
            String id = "";
            int idInt = 0;
            String stName = (String) doc.get("stName");
            user.setStName(stName);
            String stID = (String) doc.get("stID");
            user.setStID(stID);
            String stDOB = (String) doc.get("stDOB");
            user.setStID(stDOB);
            user = new User(stName, stID, stDOB);
            list.add(user);
        }
        return list;
    }

    public static void main(String[] args) {
        insertToMongoDB(new User("Fahim Ahmed2", "3713", "02-1988"));
        List<User> user = readFromMongoDB();
        for (User person : user) {
            System.out.println(person.getStName() + " " + person.getStID()+" "+person.getStDOB());
        }
    }
}


