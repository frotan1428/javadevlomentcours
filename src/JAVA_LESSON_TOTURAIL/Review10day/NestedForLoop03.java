package JAVA_LESSON_TOTURAIL.Review10day;

import java.util.Scanner;

public class NestedForLoop03 {
    public static void main(String[] args) {

        //example Write a Java Program to Print Rectangle Star Pattern using For Loop
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter of rows");
        int rows= scan.nextInt();

        System.out.println("Please enter of colum");
        int colum= scan.nextInt();

        for (int i=1;i<rows+1; i++){
            for (int k=1;k<colum+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
