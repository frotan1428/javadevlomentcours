package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;

public class List10Day01 {
    //Increase the value of every element by 3 except 7
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(11);
        list.add(12);
        list.add(13);
        list.add(7);
        list.add(9);

        System.out.println(list);//[11, 12, 13, 7, 9]

        for (Integer w:list){
            if (w==7){
                continue;
            }else{
                list.set(list.indexOf(w),w+3);
            }
        }
        System.out.println(list);




    }
}
