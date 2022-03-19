package day18ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {

    /*
    Ask user to enter a letter
	 	If the letter exists in list convert it to “Got it”
	 	otherwise add the element which user entered into the list
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please Enter a letter:");
        String letter=scan.next();

        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("K");
        list.add("R");
        list.add("S");

            if(list.contains(letter)){
                list.set(list.indexOf(letter),"Got it");
            }else{
                list.add(letter);
            }
        System.out.println(list);

    }
}
