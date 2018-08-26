package singleton.example;

public class UseOfString {
    public static void main(String[] args) {
        String st = "We are java programmers";
        String st2 = "We are c++ programmers";
        System.out.println(st.toUpperCase());
        System.out.println(st.toLowerCase());
        System.out.println(st.charAt(5));
        if (st.contains("c++")) {
            System.out.println("yes, we found it");
        } else {
            System.out.println("we didnt find it");
        }
        if (st.equals(st2)) {
            System.out.println("they are equal");
        } else {
            System.out.println("no, they are not");
        }
        if (st.equalsIgnoreCase(st2)){
            System.out.println("there are same");
        }
    }
}
