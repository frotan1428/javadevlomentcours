package day18ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {

    //Find the closest 2 integers in the given list  [12,15,10,21]==>[10,12,15,21]
    public static void main(String[] args) {


        ArrayList<Integer> list=new ArrayList<>();

        list.add(12);
        list.add(15);
        list.add(10);
        list.add(21);
        list.add(13);
        System.out.println(list);
        // if you want  to  use List element the following Code
        Collections.sort(list);
        System.out.println(list);

        // if you want  work minimum value make the initial value maximum

        int minDiff=Integer.MAX_VALUE;

        // if you want to use consecutive indexes in a loop make the starting the value of "1" use "i-1" and "i" as indexes.
        // if you use values "0" and indexes as "i+1" and "i" you will get error.

        for (int i=1;i< list.size();i++){
            minDiff=Math.min(minDiff,list.get(i)- list.get(i-1));


        }
        for (int i=1;i< list.size();i++){
            if (list.get(i)-list.get(i-1)==minDiff){
                System.out.println(list.get(i) + ","+ list.get(i-1));
                break;
            }
        }



    }
}
