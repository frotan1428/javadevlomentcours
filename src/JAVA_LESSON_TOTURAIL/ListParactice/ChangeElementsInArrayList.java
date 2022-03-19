package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;

public class ChangeElementsInArrayList {
    // change the element less than 10 to 777
    public static void main(String[] args) {

        List<Integer> al1 = new ArrayList<>();
        al1.add(8);
        al1.add(5);
        al1.add(13);
        al1.add(15);
        al1.add(7);
        //1.way
        for (Integer w:al1){
            if (w<10){
                al1.set(al1.indexOf(w),777);
            }

        }
        System.out.println(al1);//[777, 777, 13, 15, 777]

        //2way
        for (int i=0;i<al1.size();i++){
            if (al1.get(i)<15){
                al1.set(i,888);
            }
        }
        System.out.println(al1);//[777, 777, 888, 15, 777]


    }
}
