package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("NY");
        list.add("FL");
        list.add("AZ");
        list.add("CA");
        /*
        // add an element in the 3 rd position 
	        list.add(2, "AA");
	        List<String> ll =new LinkedList<String>();
	        // add an other list to the first one 
	        ll.add("BB");
	        ll.add("CC");
	        list.addAll(ll);

        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        } */
        for(String st:list){
            System.out.println(st);
        }
    }
}
