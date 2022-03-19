package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class modules02 {

    public static void main(String[] args) {

       /*
        Ask user to enter two integer values. Write a Java Program to swap
        two numbers by using the third variable.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter the First Integer:");
        int st1=scan.nextInt();
        System.out.println("Please Enter the Second Integer:");
        int st2=scan.nextInt();

        System.out.println("before swapping number:"+st1+" "+st2);

        //swapping
        st1=st1+st2;//25
        st2=st1-st2;//-1
        st1=st1-st2;//-1
        System.out.println("after swapping number:"+st1+" "+st2);






    }

}
