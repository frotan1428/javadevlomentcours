package JAVA_LESSON_TOTURAIL.DoWhileLoop;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        /*
            Ask user to enter a number.
                 If the number is divisible by 10 then print "Won!" on the console
                 otherwise ask user  to enter another number.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a Integer:");
        int num=scan.nextInt();
        do {
            if (num%10==0){
                System.out.println("won!");

                num++;
                break;
            }

        }while (num%10!=0);
            System.out.println("Please Enter a Integer:");
            num=scan.nextInt();

    }
}
