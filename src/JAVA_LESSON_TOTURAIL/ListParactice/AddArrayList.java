package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;

public class AddArrayList {

    //How  to add elements into a ArrayList

    public static void main(String[] args) {


        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(12);
        al1.add(10);
        al1.add(15);
        System.out.println(al1);//[12, 10, 15, 12]

        //How  to add elements into a ArrayList by index.
        al1.add(3,12);
        System.out.println(al1);//[12, 10, 15, 12]



    }
}
