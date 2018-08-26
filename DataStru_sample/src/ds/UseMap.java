package ds;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {
        Map<String, String> cityNcountry = new LinkedHashMap<String, String>();
        cityNcountry.put("USA", "NY");
        cityNcountry.put("UK", "London");
        cityNcountry.put("Canada", "Montreal");

        for(Map.Entry<String, String> state:cityNcountry.entrySet()){
            System.out.println(state.getKey() + "---> " + state.getValue());
        }
    }
}
