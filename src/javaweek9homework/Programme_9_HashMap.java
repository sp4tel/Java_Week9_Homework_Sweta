package javaweek9homework;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {

    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Alison", 25);
        people.put("Eva", 30);
        people.put("Ian", 35);
        people.put("Riley" , 18);

        // iterate over the values in the map using a for-each loop
        for (Map.Entry<String,Integer> name : people.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }
    }


}
