package JAVA_LESSON_TOTURAIL.Review10day;

import java.util.Scanner;

public class WhileLoop05 {

    public static void main(String[] args) {

        /*
		 Type java code by using while loop,
	     Write a program that prompts the user to input a number.
	     It should then print the multiplication table of that number.

	     3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30

         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Please Enter any Integer");

        int num=scan.nextInt();

        int y=1;
        while (y<11){

            System.out.println(num+"X"+y+"="+num*y);

            y++;
        }

    }
}
