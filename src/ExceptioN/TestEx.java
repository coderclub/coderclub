package ExceptioN;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestEx {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String path = "C:\\Users\\mdnas\\Desktop\\PuBg.txt";

        try {
            fr = new FileReader(path);
        } catch (Exception ex) {
            System.out.println("file not found");
        }

        try {
            br = new BufferedReader(fr);
            String data ;
           while ((data = br.readLine()) != null){
            System.out.println(data);}
        } catch (Exception ex) {
            System.out.println("file not readable");
        }
    }

}
