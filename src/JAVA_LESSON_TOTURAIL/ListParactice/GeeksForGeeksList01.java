package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;

public class GeeksForGeeksList01 {


    public static void main(String[] args) {


        List<Integer> al1=new ArrayList<>();

        al1.add(1);
        al1.add(2);

        System.out.println(al1);

        List<Integer> al2=new ArrayList<>();

        al2.add(1);
        al2.add(2);
        al2.add(3);
        al2.add(1,12);

        System.out.println(al2);
        System.out.println(al2.get(3));

        al2.set(0,12);
        System.out.println(al2);
    }
}
