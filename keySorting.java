
// we can sort HashMap on the basis of key or value
// Here we are sorting on the basis of key 
// sorting the element by key, using treemap
// Treemap is mostly used when it come to sorting on the basis of key
// basically we need to pass the list into treemap it will automatically sort the list

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;

public class keySorting {
    public static void main(String args[]) {
        // implementation of HashMap
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        // addding keys and values to HashMap
        hm.put(23, "Yash");
        hm.put(17, "Arun");
        hm.put(15, "Swarit");
        hm.put(9, "Neelesh");

        // here we are using iterator(new concept) for printing

        Iterator<Integer> it = hm.keySet().iterator();
        System.out.println("Before Sorting");
        while (it.hasNext()) {
            int key = (int) it.next();
            System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
        }

        System.out.println("\n");
        System.out.println("After Sorting");


        // using TreeMap constructor to sort the HashMap
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm);
        Iterator itr = tm.keySet().iterator();
        while (itr.hasNext()) {
            int key = (int) itr.next();
            System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
        }
    }
}