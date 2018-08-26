package ExceptioN;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class ExceptionH {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        FileReader fr = null;
        BufferedReader br = null;
        String path = "C:\\Users\\mdnas\\Desktop\\JavaSample\\Nettheke.txt";

        try {
            fr = new FileReader(path);
        } catch (Exception ex) {
            System.out.println("Check your path");
        }
        try {
            br = new BufferedReader(fr);
            String data = "";
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }

        } catch (Exception ex) {
            System.out.println("You r gada");


        }
    }
}
