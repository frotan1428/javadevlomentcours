package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;

public class GFG01 {

    public static void main(String[] args) {

        List<String> sl=new ArrayList<>();

        sl.add("Geek");
        sl.add("Geek");
        sl.add("Geek");
        System.out.println(" Initial ArrayList "+sl);//Initial ArrayList [Geek, Geek, Geek]
        sl.set(1,"For");
        System.out.println("Updated ArrayList " + sl);//Updated ArrayList [Geek, For, Geek]
    }
}
