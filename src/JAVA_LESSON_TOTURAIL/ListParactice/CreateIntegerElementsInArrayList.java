package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;

public class CreateIntegerElementsInArrayList {


    //Create 5 an Integer List  and add 5 elements into it.
    public static void main(String[] args) {
        List<Integer> al1=new ArrayList<>();

        al1.add(10);
        al1.add(11);
        al1.add(13);
        al1.add(14);
        al1.add(15);
        System.out.println(al1);//[10, 11, 13, 14, 15]

        // how to add a specific elements in another list.
        List<Integer> al2=new ArrayList<>();
        al2.add(16);
        al2.add(17);
        System.out.println(al2);//[16, 17]
        al1.addAll(al2);
        System.out.println(al1);//[10, 11, 13, 14, 15, 16, 17]

        List<Integer> al3 = new ArrayList<>();
        al3.add(20);
        al3.add(30);
      al2.addAll(0,al3);
        System.out.println(al2);//[20, 30, 16, 17]
        //how to remove all elements in arraylist al3.
        al2.removeAll(al3);
        System.out.println(al2);//[16, 17]
        //how to Check if an elements is existed or not.
        boolean isEx= al2.contains(16);
        System.out.println(isEx);//True
        System.out.println(al2.contains(18));//false

        // how to Clear all elements is An ArrayList
          al3.clear();
        System.out.println(al3);//[]







    }
}
