package ds;

import java.util.List;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("NY");
        stack.push("FL");
        stack.push("CA");

        /*
        if(stack.peek().equalsIgnoreCase("NY")) {
            System.out.println(stack.pop());
        } */

        while(!stack.empty()){
            System.out.println(stack.pop());
        }

    }
}
