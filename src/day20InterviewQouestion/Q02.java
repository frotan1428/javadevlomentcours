package day20InterviewQouestion;

import java.util.Scanner;

public class Q02 {
    //Write a Java Program to swap two numbers
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter 2 number swap");
        double n1= scan.nextDouble();
        double n2= scan.nextDouble();
        System.out.println("before swapping :"+n1+ " " +n2);
       /*
        1.way
            double temp=n1;
            n1=n2;
            n2=temp;
            System.out.println("After swapping :"+n1+ " " +n2);

        */

        //2. way of swapping

        n1  = n1 + n2 ;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("After swapping numbers: " + n1 +" " + n2);


    }
}
