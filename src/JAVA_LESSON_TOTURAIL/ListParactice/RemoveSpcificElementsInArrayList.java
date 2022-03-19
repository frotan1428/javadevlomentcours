package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;

public class RemoveSpcificElementsInArrayList {

    public static void main(String[] args) {

        //Create  String ArrayList, add 5 elements into it, remove a specific element

        List<String> al1=new ArrayList<>();
        al1.add("Frotan");
        al1.add("Nazari");
        al1.add("Mojib");
        al1.add("Karim");
        al1.add("Zaman");
        System.out.println(al1);//[Frotan, Nazari, Mojib, Karim, Zaman]

        al1.remove(2);
        System.out.println(al1);//[Frotan, Nazari, Karim, Zaman]

    }
}
