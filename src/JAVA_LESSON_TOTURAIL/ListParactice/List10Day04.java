package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.Collections;

public class List10Day04 {

    //Find the closest 2 integers in the given list  [12,15,10,21]==>[10,12,15,21]
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(12);
        list.add(11);
        list.add(10);
        list.add(22);
        list.add(21);

        Collections.sort(list);
        System.out.println(list);

        int minDiff=Integer.MAX_VALUE;

        for (int i=1;i< list.size(); i++){

            minDiff=Math.min(minDiff,list.get(i)-list.get(i-1));
        }
        for (int i=1; i<list.size();i++){

            if (list.get(i)-list.get(i-1)==minDiff){
                System.out.println(list.get(i)+","+list.get(i-1));
                break;
            }
        }


    }
}
