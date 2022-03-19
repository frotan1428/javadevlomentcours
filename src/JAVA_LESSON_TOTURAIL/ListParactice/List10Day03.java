package JAVA_LESSON_TOTURAIL.ListParactice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List10Day03 {


        /*
         Ask user to enter a letter
	 	    If the letter exists in list convert it to “Love”
	 	    otherwise add the element which user entered into the list
        */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Letter");
        String letter=scan.next();

        List<String> list=new ArrayList<>();
        list.add("FROTAN");
        list.add("k");
        list.add("HAFASA");


        if (list.contains(letter)){
            list.set(list.indexOf(letter),"love");
        }else{
            list.add(letter);
        }
        System.out.println(list);//[FROTAN, love, HAFASA]

    }
}
