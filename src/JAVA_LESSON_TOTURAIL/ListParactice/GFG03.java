package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;

// Java program to Iterate the Elements
public class GFG03 {

    public static void main(String[] args) {

        List<String> sl=new ArrayList<>();

        sl.add("Geek");
        sl.add("For");
        sl.add("Geek");
        System.out.println("--------For  Loop---------");
        for (int i=0;i<sl.size(); i++){
            System.out.println(sl.get(i));
        }

        System.out.println("--------For Each Loop---------");
        for (String st:sl){
            System.out.println(st);
        }


    }
}
