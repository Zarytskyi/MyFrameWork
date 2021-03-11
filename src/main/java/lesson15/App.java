package lesson15;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        // IN hash first is a key*index* second is value
        // .put does not create exact order. It's random
        countries.put("China", "Asia");
        countries.put("France", "Europe");
        countries.put("Germany", "Europe");
        countries.put("USA", "North America");
        countries.put("Canada", "North America");
        countries.put("Canada", "North Pole");

        System.out.println(countries);
        System.out.println(countries.get("Canada"));

        countries.replace("Canada","North America"); // keep key but replace a value
        System.out.println(countries);
        String xx = countries.remove("Germany"); // remove by key
        System.out.println(xx);
        boolean vv = countries.containsKey("China"); // check for contains *need to be boolean*
        System.out.println(vv);

        for (String key: countries.keySet()){ // return a key that are uniq
            System.out.println(key);
        }
        for (String value: countries.values()){ // return values that are not
            System.out.println(value);
        }
        for (Map.Entry<String, String> entry: countries.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue()); // return a key set for both
        }
    }

}
