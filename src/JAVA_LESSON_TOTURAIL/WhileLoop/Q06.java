package JAVA_LESSON_TOTURAIL.WhileLoop;

import java.util.Scanner;

public class Q06 {

    /*
     Type java code by using while loop,
         Write a program to count the factors of an integer which is entered by user.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter an integer");
        int number=scan.nextInt();
        System.out.println("The Factor Number :"+number);
        int i=1;
        while (i<=number){

            if (number%i==0){

                System.out.print(i+" ");

            }
            i++;
        }


    }
}
