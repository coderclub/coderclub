package UseArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseOfIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(10);
        list.add(15);

        Iterator it = list.iterator ();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}


