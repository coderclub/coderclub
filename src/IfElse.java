public class IfElse {
    public static int testScore = 78;
    public static void main(String[] args) {

        char grade ;

        if (testScore>=90) {
            grade = 'A';
        }

        else if (testScore>=80){
            grade = 'B';
        }
        else if (testScore>=70){
            grade = 'C';
            System.out.println("Passed");
        }
        else {grade = 'F';}
        System.out.println("My Grade is: " + grade);

        for (int con=10; con<=100; ++con){
            // if (
            System.out.println(con);
        }

    }
}
