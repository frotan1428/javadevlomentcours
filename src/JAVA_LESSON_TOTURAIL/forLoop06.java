package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class forLoop06 {
    public static void main(String[] args) {
        //1.example: put * between to consecutive Character in String fro example:java====>j*a*v*a*
        // if you work with String you must start with index;

        String st="FROTAN";

        System.out.println("Please Enter Any String");
        Scanner scan=new Scanner(System.in);
        String st2=scan.nextLine();

        System.out.println("This is Your String length:"+st.length());

        for (int i=0;i<st2.length(); i+=1){

            System.out.print(st2.charAt(i)+"*");


        }

    }
}
