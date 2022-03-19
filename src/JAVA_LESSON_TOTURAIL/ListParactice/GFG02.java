package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;

public class GFG02 {

    // Java Program to Remove Elements from a List

    public static void main(String[] args) {


        List<String> sl=new ArrayList<>();

        sl.add("Geek");
        sl.add("Geek");
        sl.add(1,"For");
        System.out.println(" Initial ArrayList "+sl);// [Geek, Geek, Geek]
          // Now remove element from the above list
        sl.remove(1);
        System.out.println("Remove after ArrayList " + sl);// [Geek, Geek]
        sl.remove("Geek");
        System.out.println(" Finally ArrayList " + sl);// [Geek]
    }
}
