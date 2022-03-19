package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;

public class List10Day02 {
    //How to Remove Duplicates from  an ArrayList .[2,3,2,5]==> [2,3,5]
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(4);


        ArrayList<Integer> list2=new ArrayList<>();

        for (Integer w:list1){
            if (!list2.contains(w)){
                list2.add(w);
            }
        }
        System.out.println(list2);

        ArrayList<String> st1=new ArrayList<>();
        st1.add("M");
        st1.add("O");
        st1.add("H");
        st1.add("A");
        st1.add("M");
        st1.add("M");
        st1.add("A");
        st1.add("D");
        System.out.println(st1);
        ArrayList<String> st2=new ArrayList<>();
        for (String w:st1){
            if (!st2.contains(w)){
                st2.add(w);
            }
        }
        System.out.println(st2);



    }
}
