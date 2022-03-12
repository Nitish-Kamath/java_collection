
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


    }
}