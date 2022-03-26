package Paractice08;

import java.util.*;

public class Q01 {
    public static void main(String[] args) {

        /*
         Create a list by getting the list from user
         if there is  duplicate elements remove them from the list(you can use Set)
         note: Give a massage to the user as "Enter list elements to stop entrance press '*'"


         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter list elements to stop entrance press '*'");
        List<String> list = new ArrayList<>();
        String str="";
        while (!str.equals("*")){
            str= scan.next();
            if (!str.equals("*")){
                list.add(str);
            }
        }
        System.out.println(list);

        //if they ask you to remove duplicates  elements you can use set
        Set<String> listSet=new HashSet<>(list);
        System.out.println(listSet);

    }

}
