package JAVA_LESSON_TOTURAIL.WhileLoop;

import java.util.Scanner;

public class Q07 {


    //Type java code by using while loop,
    //Write a program that prompts the user to input an integer.
    //It should then find sum of the digits of that number

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter an integer");
        int number=scan.nextInt();

        int sum=0;
        int m,i=1;

        while (number>0){

            m=number%10;

            sum=sum+m;
            number=number/10;
        }
        System.out.println(sum);


    }
}
