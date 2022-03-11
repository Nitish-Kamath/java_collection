import java.util.ArrayList;
import java.util.*;
// arraylist with user defined datatype

class student {
    String name;
    char sec;
    int roll;

    student(String name, char sec, int roll) {

        this.name = name;
        this.sec = sec;
        this.roll = roll;
    }

}

class arrayList02 {
    public static void main(String[] args) {
        ArrayList<student> alist = new ArrayList<>();

        student s1 = new student("anil", 'a', 01);
        student s2 = new student("ashok", 'b', 02);
        student s3 = new student("ayush", 'c', 03);

        alist.add(s1);
        alist.add(s2);
        alist.add(s3);

        Iterator itr = alist.iterator();

        while (itr.hasNext()) {
            student st = (student) itr.next();
            System.out.println(st.name + " " + st.sec + " " + st.roll);
        }

    }
}