package singleton.example;

import java.util.ArrayList;
import java.util.List;

public class House {
    private House(){}
    //private static House house = new House();
    private static House house1 = new House();
    private static House house2 = new House();
    private static List<House> houseList = new ArrayList<House>();


    /* public static House getSingleton (){
      House house = new House();
      return house;
    }*/
    public static List<House> getSingleton() {
        houseList.add(house1);
        houseList.add(house2);
        return houseList;
    }

    public void displayHouseNo(){
        System.out.println(1030);
    }
}
