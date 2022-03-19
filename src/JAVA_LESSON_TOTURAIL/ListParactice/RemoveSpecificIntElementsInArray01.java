package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;

public class RemoveSpecificIntElementsInArray01 {

    //Create a String ArrayList, add 5 elements into it, remove the elements whose lengths are less than 5

    public static void main(String[] args) {

        List<String> al7 = new ArrayList<String>();
        al7.add("Christian");
        al7.add("Alex");
        al7.add("Tommy");
        al7.add("Adriana");
        al7.add("Tom");

        System.out.println(al7);//[Christian, Alex, Tommy, Adriana, Tom]
        //Clone the al7 and use the cloned ArrayList inside the loop
        List<String> cloned=new ArrayList<>(al7);
       for (String w:cloned){
           if (w.length()<5){
               al7.remove(w);
           }
       }
        System.out.println(al7);

    }
}
