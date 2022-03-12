// Java program to illustrate HashMap class of java.util
// package

// Importing HashMap class
import java.rmi.Remote;
import java.util.HashMap;
import java.util.*;
// Main class
public class hashmap01 {

    // Main driver method
    public static void main(String[] args) {
        // Create an empty hash map by declaring object
        // of string and integer type
        // no need to intialise with Generic type again
        // (10,0.75f)
        // (int initialCapacity, float loadFactor)
        HashMap<String, Integer> hmap = new HashMap<>();

        // Adding elements to the map
        // using standard add() method
        hmap.put("vishal", 10);
        hmap.put("sachin", 30);
        hmap.put("vaibhav", 20);

        // updating the values
        hmap.put("vaibhav", 40);

        hmap.remove("vishal");

        // Print size and content of the hmap
        System.out.println("Size of hmap is:- "
                + hmap.size());

        // Printing elements in object of hmap
        System.out.println(hmap);

        System.out.println((hmap.containsKey("vishal")));
        System.out.println(hmap.get("vishal"));
        hmap.clear();
        System.out.println(hmap.containsKey("vishal"));
        System.out.println(hmap.containsValue(10));

        System.out.println(hmap.get("vishal"));
        System.out.println(hmap.isEmpty());

        System.out.println(hmap.keySet());
        System.out.println(hmap.size());
        System.out.println(hmap.values());
        System.out.println(hmap.hashCode());
        System.out.println(hmap.toString());

        // PASSING HASHMAP VALUE INTO ANOTHER HASHMAP

        // HashMap<String, Integer> hmap02 = new HashMap<>(hmap);
        // System.out.println("Element of hmap02 are:-");
        // System.out.println(hmap02);

     
    }
}
