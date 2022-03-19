package JAVA_LESSON_TOTURAIL.Ternary;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

        /*
                    Type java code by using using ternary.
                Take values of length and width of a rectangle from user and check if it is square or not.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter an Integer");
        int st=scan.nextInt();
        System.out.println("Please Enter an Integer");
        int st1=scan.nextInt();
        int a=st1*st;
         String  result=(a<10)? "rectangle":"not rectangle";
        System.out.println(result);
    }
}
