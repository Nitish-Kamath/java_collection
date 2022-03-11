/*
dynamic array
like vector in c++
size can be modified
found in java.util package
implents list interface
memory is allocated in random fashion
manipulation is slower bcz of shifting 
need to use Wrapper class for creation like Integer, String,Character
ArrayList<Integer> al = new ArrayList<Integer>();
NOTE:- remember to import java.util.*; to use all functionality of collection

 */

import java.util.*;

class arrayList01 {
    public static void main(String[] args) {

        // () -> used to add intial capacity of arraylist rem it is not the final
        // capacity
        ArrayList<String> alist = new ArrayList<>();

        ArrayList<String> myname = new ArrayList<>();

        myname.add("nitish");
        myname.add("kumar");
        myname.add("kamath");
        myname.add("guddu");

        // adding element in arraylist
        alist.add("anil");
        alist.add("ashok");
        alist.add(2, "third");

        // all element will be deleted
        alist.clear();

        // adding one collection into another
        alist.addAll(myname);

        // rem to use util package
        Collections.sort(alist);

        System.out.println(alist.contains("kamath"));
        System.out.println(alist.indexOf("kamath"));
        System.out.println(alist.isEmpty());

        // converting arrayList into array
        // toArray() return type is object so we have to convert it
        // into corresponding data type (same as parent arraylist)

        // finding size of array list
        // int len = alist.size();

        String[] arr = new String[alist.size()];
        arr = alist.toArray(arr);

        for (String x : arr)
            System.out.print(x + " ");

        // updating value of list

        alist.set(2, "aryan");

        // removing elements
        alist.remove("anil");
        alist.remove(1);

        // printing

        System.out.println(alist);
        // format type [anil,ashok]

        String name = alist.get(0);

        Iterator it = alist.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String st : alist)
        System.out.println(st);
    }
}