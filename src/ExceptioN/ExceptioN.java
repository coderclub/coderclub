package ExceptioN;

public class ExceptioN {

    public static void main(String[] args) {

        try {
            int a = 10;
            int result = a / 0;
            System.out.println(result);
        }
        catch (Exception ex){
            System.out.println("tui beta alu");
        }
    }
}
