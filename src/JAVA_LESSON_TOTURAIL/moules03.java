package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class moules03 {
    public static void main(String[] args) {


        /*

        Ask user to enter two integer values. Write a Java Program to swap
        two numbers by using the third variable.
         */
        int st3;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter the First Integer:");
        int st1=scan.nextInt();
        System.out.println("Please Enter the Second Integer:");
        int st2=scan.nextInt();
        System.out.println("before swapping number:"+st1+" "+st2);

        //swapping
            st3=st1;  //12
            st1=st2;  //13
            st2=st3;  //12

        System.out.println("after swapping number:"+st1+" "+st2);



    }
}
