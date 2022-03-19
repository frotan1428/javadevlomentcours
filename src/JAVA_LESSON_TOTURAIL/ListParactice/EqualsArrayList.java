package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;

public class EqualsArrayList {
         //how to Check if 2 String ArrayList are Equals or Not.
    public static void main(String[] args) {

        List<String> al1=new ArrayList<>();
        al1.add("FROTAN");
        al1.add("HAFFASA");

        List<String> al2=new ArrayList<>();
        al2.add("FROTAN");
        al2.add("HAFFASA");
        System.out.println(al1.equals(al2));//true
        //or

        boolean isEquals=al1.equals(al2);
        System.out.println(isEquals);  //ture

        List<Integer> al3=new ArrayList<>();
        al3.add(12);
        al3.add(13);

        List<Integer> al4=new ArrayList<>();
        al4.add(12);
        al4.add(13);

        System.out.println(al3.equals(al4)); //Ture


    }
}
