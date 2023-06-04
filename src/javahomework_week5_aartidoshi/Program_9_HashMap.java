package javahomework_week5_aartidoshi;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer values: And use for each loop to iterate the value from Map.
 */

public class Program_9_HashMap {

    public static void main(String[] args) {
        HashMap<String,Integer> People = new HashMap<>();

        People.put("Aarti", 10);
        People.put("Riya", 20);
        People.put("Jasmeen", 30);
        People.put("Sarvat" ,40);
        People.put("Komal",50);
        People.put("Mukesh",60);
        People.put("Jaydeep",70);

        for (Map.Entry<String,Integer> people : People.entrySet()) {
            System.out.println(people.getKey() + " = " + people.getValue());
        }


    }
}