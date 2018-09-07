package connectMongoDB;

public class User {

    String Student_ID;
    String Student_Name;
    String Student_DOB;

    public User(){}
    public User(String stName, String stID){
        this.Student_Name = stName;
        this.Student_ID = stID;
    }
    public User(String stName, String stID, String stDOB){
        this.Student_Name = stName;
        this.Student_ID = stID;
        this.Student_DOB = stDOB;

    }
    public String getStName() {
        return Student_Name;
    }

    public void setStName(String stName) {
        this.Student_Name = stName;
    }

    public String getStID() {
        return Student_ID;
    }

    public void setStID(String stID) {
        this.Student_ID= stID;
    }

    public String getStDOB() {
        return Student_DOB;
    }

    public void setStDOB(String stDOB) {
        this.Student_DOB = stDOB;
    }




}

