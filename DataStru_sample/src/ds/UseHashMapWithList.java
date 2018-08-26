package ds;

import java.util.*;

public class UseHashMapWithList {
    public static void main(String[] args) {
        List<String> cityOfUSA = new ArrayList<String>();
        cityOfUSA.add("NY");
        cityOfUSA.add("FL");
        cityOfUSA.add("AZ");
        cityOfUSA.add("CA");

        List<String> cityOfUK = new ArrayList<String>();
        cityOfUK.add("London");
        cityOfUK.add("Manchester");
        cityOfUK.add("Chelsea");

        List<String> cityOfBD = new ArrayList<String>();
        cityOfBD.add("Dhaka");
        cityOfBD.add("Comilla");
        cityOfBD.add("Barisal");
        cityOfBD.add("Mymensing");
        cityOfBD.add("Sylhet");

        Map<String, List<String>> listOfCountryNCity = new LinkedHashMap<String, List<String>>();
        listOfCountryNCity.put("USA", cityOfUSA);
        listOfCountryNCity.put("UK", cityOfUK);
        listOfCountryNCity.put("BD", cityOfBD);

        for(Map.Entry<String, List<String>> state:listOfCountryNCity.entrySet()){
            if(listOfCountryNCity.get("UK").contains("Manchester")){
              System.out.println(state.getKey() + "---> " + state.getValue());
            }
        }
    }
}
