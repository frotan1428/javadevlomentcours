package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class ifStatementQ4 {

    public static void main(String[] args) {

        /*
          Ask user to enter the values of length and width of a rectangle, then check if it is square or not.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter  length");
         int length=scan.nextInt();
        System.out.println("Please Enter  Width");
        int width=scan.nextInt();
        if (length==width){
            System.out.println("this is a Square");
        }
        if (length!=width){
            System.out.println("this is not a Square");
        }


    }
}
