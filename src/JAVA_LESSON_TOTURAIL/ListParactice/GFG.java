package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;

public class GFG {

    public static void main(String[] args) {

        List<String> sl=new ArrayList<>();

        sl.add("Geek");
        sl.add("For");
        sl.add("Geek");


        System.out.println(sl);//[Geek, For, Geek]

        List<String> sl2=new ArrayList<>();

        sl2.add("Frotan");

        sl2.add("Haffasa");
        sl2.add(1,"Love");


        System.out.println(sl2);//[Frotan, Love, Haffasa]

    }
}
