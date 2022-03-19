package JAVA_LESSON_TOTURAIL.Ternary;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {


            /*

                    Ask user ta enter a number. If the number is less than 10 and greater
            than or equal to 0, calculate its cube. Otherwise, calculate its square.
            Cube of a = a*a*a Square of a = a*a
           */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter an Integer");
        int num=scan.nextInt();

        System.out.println((num<10) ? num*num*num :num*num);



    }
}
