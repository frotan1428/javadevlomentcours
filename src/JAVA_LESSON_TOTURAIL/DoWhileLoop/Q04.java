package JAVA_LESSON_TOTURAIL.DoWhileLoop;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {


        /*
	 	  Ask user to enter an integer.
		  If the integer is less than 100, tell user “Won!”
		  Otherwise, tell user “Lost!”
	 */
        Scanner scan=new Scanner(System.in);
        int num=0;

        do {
           if (num<100){
               System.out.println("Won!");
           }

        }while(num<100);
        System.out.println("Lost");
    }
}
