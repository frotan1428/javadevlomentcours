package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;

public class RemoveSpecificIntegerElementsInArray {

    public static void main(String[] args) {

        //How to remove a specific integer element from an integer list
        //1.Step:Create an Integer Wrapper Class Object by using the value which you want to remove

        ArrayList<Integer> al6 = new ArrayList<>();
        al6.add(12);
        al6.add(13);
        al6.add(7);
        al6.add(32);
        al6.add(1);
        System.out.println(al6);//[12, 13, 7, 32, 1]
        Integer el=Integer.valueOf(32);
        //2.Step: Use the created Integer object inside the remove()
        al6.remove(el);
        System.out.println(al6);//[12, 13, 7, 1]

    }
}
