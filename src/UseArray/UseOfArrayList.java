package UseArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseOfArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0, 10);
        list.add(10);
        list.add(15);
        list.add(1, 20);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));


        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
