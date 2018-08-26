package Loop;

import java.util.Scanner;

public class UseForLoop {

    public static void main(String[] args) {

        int number, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your no: ");
        number = sc.nextInt();

        for (i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.format(" %d ", i);
            }
        }
    }
}
