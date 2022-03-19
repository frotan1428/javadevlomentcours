package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.LinkedList;
import java.util.List;

public class GFG06 {

    public static void main(String[] args)
    {

        // Initializing a list of type Linkedlist
        List<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(7);
        l.add(3);
        System.out.println(l);
        System.out.println(l.lastIndexOf(3));

        // Initializing a list of type Linkedlist
        List<String> l2 = new LinkedList<>();
        l2.add("10");
        l2.add("30");
        l2.add("50");
        l2.add("70");
        l2.add("30");
        System.out.println(l2);
        System.out.println(l2.lastIndexOf("30"));
        System.out.println(l2.indexOf("30"));
    }
}
