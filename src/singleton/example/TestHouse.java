package singleton.example;

public class TestHouse {
    public static void main(String[] args) {
        House house = House.getSingleton().get(0);
        house.displayHouseNo();
        House house1 = House.getSingleton().get(1);
        house1.displayHouseNo();
        House house2 = House.getSingleton().get(3);
        System.out.println(house.hashCode());
        System.out.println(house1.hashCode());
        System.out.println(house2.hashCode());
    }
}
