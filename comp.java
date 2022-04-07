import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;

public class comp {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(50);
        arr.add(14);
        arr.add(20);

        // Collections.sort(arr);

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (o1 > o2)
                    return 1;

                return -1;
            }

        };

        Collections.sort(arr, com);

        for (int i : arr) {
            System.out.println(i);
        }

    }

}
