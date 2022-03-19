package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class ifElseStatementQ7 {
    public static void main(String[] args) {

        /*

        Type java code by using if-else statement,
        Write a program to print absolute value of a number entered by user.
        Absolute Value: If the number is positive or zero return the number itself
        If the number is negative return the number after multiplying by -1
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter any integer");
        int num=scan.nextInt();
        if (num>=0){
            System.out.println("This is Positive number Or Zero:"+num);
        }else{
            System.out.println("this is Negative number:"+num);
            System.out.println("This is Negative number Multiply By -1:"+num*-1);
        }

    }
}
