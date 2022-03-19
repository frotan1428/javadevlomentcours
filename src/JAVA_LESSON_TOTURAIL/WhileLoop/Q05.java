package JAVA_LESSON_TOTURAIL.WhileLoop;

import java.util.Scanner;

public class Q05 {

    /*

    Type java code by using while loop,
          Write a program that prompts the user to input a positive integer.
         It should then print factorial of that number.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter an integer");
        int number=scan.nextInt();
           int fact=1;
           int i=1;
           while (i<=number){

               fact=fact*i;
               i++;
           }
        System.out.println("The factorials of Number :"+fact);



    }
}
