package day21varargsstringbulideraccessmodifires;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class practice {

    public static void main(String[] args) {

        //Find the smallest positive integer and greatest negative integer in a given integer list

        ArrayList<Integer> list=new ArrayList<>();

        list.add(-12);
        list.add(18);
        list.add(-5);
        list.add(23);
        list.add(-2);

        System.out.println(list);//[-12, 18, -5, 23, -2]
        //sort the ist elements.
        Collections.sort(list);//[-12, -5, -2, 18, 23]
       // assign value
        int minPositive=list.get(list.size()-1);
        int MaxNegative =list.get(0);

        //loop

        for (Integer w:list){
            if (w>=0){
                minPositive=Math.min(minPositive,w);
            }
            if (w<0){
                MaxNegative=Math.max(MaxNegative,w);
            }
        }
        System.out.println(minPositive);
        System.out.println(MaxNegative);

    }
}
