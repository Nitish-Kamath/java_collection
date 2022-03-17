
// printing values in hash map 
import java.util.*;

class testing {
    public static void main(String args[]) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        //

        for (Map.Entry m : hm.entrySet()) {
        System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println(hm);
        System.out.println(Arrays.asList(hm));
        System.out.println(Collections.singletonList(hm));
        
//         best method for printing
         hmap.forEach((k, v) -> System.out.println(k + "\t" + v));
        
        
//         printing the element using iterator
//         why<Integer> bcz key value is Integer
//         .keySet() -> MASTER POINT
       Iterator<Integer> it = hm.keySet().iterator();
        System.out.println("Value of Key value of Hmap");
        while (it.hasNext()) {
            int key = (int) it.next();
            System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
        }

    }
}
