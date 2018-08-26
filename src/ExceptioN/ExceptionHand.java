package ExceptioN;


import java.io.BufferedReader;
import java.io.FileReader;

public class ExceptionHand {
    static String path = "C:\\Users\\mdnas\\Desktop\\JavaSample\\gitty.txt";
    static FileReader ffr;
    static BufferedReader br;

    static int b = 15;
    int a = 5;
    int c = 5;


    public static void main(String[] args) {

        FinalL fl = new FinalL();
        fl.finalize();
        ExceptionHand exh = new ExceptionHand();
        exh.add();
        exh.th();

    }

    public void add() {

        System.out.println(a + b);
    }

    public void th() {
        System.out.println(a == c);

    }

    /*  try {
            ffr = new FileReader(path);
            System.out.println("file is found");
        } catch (Exception taque) {
            System.out.println("file in not found");
        }
        try {br = new BufferedReader(ffr);
            String data;
          while ((data = br.readLine()) !="jani" )
            System.out.println(data);}
        catch (Exception ex){
            System.out.println("again file not found");
        }
*/
}




