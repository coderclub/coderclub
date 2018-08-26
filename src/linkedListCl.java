import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedListCl {

    public static void main(String[] args) {
        List<String> list=new LinkedList<String>();
        list.add("CoderClub Members");
        list.add("Nasir");
        list.add("Fahim");
        list.add("Ahmed");
        list.add("Siddik");
        list.add("Shams");
        list.add("Asif"
                );
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(String st:list){
            System.out.println(st);
        }
    }
}
