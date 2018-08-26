package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("NY");
        queue.add("FL");
        queue.add("CA");
        //Using Iterator traverse through the LinkedList
        Iterator it = queue.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        //Using for each traverse through the LinkedList
        for(String st:queue){
            System.out.println(st);
        }
        //Using while as long as LinkedList is not isEmpty()
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
