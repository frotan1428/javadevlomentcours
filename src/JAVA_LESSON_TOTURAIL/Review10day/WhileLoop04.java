package JAVA_LESSON_TOTURAIL.Review10day;

import java.util.Scanner;

public class WhileLoop04 {

    public static void main(String[] args) {

         /*
        Type java code by using while loop,
         Write a program that prompts the user to input an integer.
         It should then find the sum of the digits of that number.
         123 ==> 1+2+3 = 6
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter any Integer:");
        int num= scan.nextInt();
        int sumOfDigit=0;

        while (num>0){
            sumOfDigit=sumOfDigit+num%10;

            num=num/10;

        }
        System.out.println(sumOfDigit);

    }
}
