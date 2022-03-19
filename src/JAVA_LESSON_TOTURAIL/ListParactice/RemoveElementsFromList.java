package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromList {

    //Create a String ArrayList, add 5 elements into it, remove a specific element

    public static void main(String[] args) {

        List<String> al5 = new ArrayList<String>();

        al5.add("Mohammad");
        al5.add("Frotan");
        al5.add("Haffasa");
        al5.add("Musleh");
        System.out.println(al5);//[Mohammad, Frotan, Haffasa, Musleh]
        al5.remove("Frotan");
        System.out.println(al5);//[Mohammad, Haffasa, Musleh];


        //How  to remove an element by index
        al5.remove(2);
        System.out.println(al5);//[Mohammad, Haffasa]



    }
}
