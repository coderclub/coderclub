package ExceptioN;

public class FinalL{

    public static void main(String[] args) {
String st = new String ("House");
        System.out.println(st);
        FinalL tf = new FinalL();
        tf.finalize();
        System.gc();
        System.out.println("End of main");
    }
    public void finalize(){
        System.out.println();
    }
}

