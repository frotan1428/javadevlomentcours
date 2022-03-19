package JAVA_LESSON_TOTURAIL.WhileLoop;

import java.util.Scanner;

public class Q04 {

        /*
        Type java code by using while loop,
            Write a program that prompts the user to input a positive integer.
            It should then print the multiplication table of that number  3x1=3
         */


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter an integer");

        int x=scan.nextInt();

        int y=1;
        while (y<11){

            System.out.println(x+"X"+y+"="+x*y);
            y++;
        }




    }
}
