package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;

// Java code to demonstrate the working of
// contains() method in List interface

public class GFG04 {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<Integer>(4);

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        boolean ans=arr.contains(2);
        System.out.println(ans);
        if (ans)
            System.out.println("The list contains 2");
        else
            System.out.println("The list does not contains 2");


        List<String> arr1 = new ArrayList<String>(4);

        // using add() to initialize values
        // ["geeks", "for", "geeks"]
        arr1.add("geeks");
        arr1.add("for");
        arr1.add("geeks");

        boolean ans1=arr1.contains("geeks");
        if (ans1)
            System.out.println("The list contains Geeks");
        else
            System.out.println("The list does not contains Geeks");
    }
}
