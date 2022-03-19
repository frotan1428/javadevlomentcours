package JAVA_LESSON_TOTURAIL.DoWhileLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

       /*
	 	  Ask user to enter an integer.
		  If the integer is less than 100, tell user “Won!”
		  Otherwise, tell user “Lost!”
	 */

        Scanner scan=new Scanner(System.in);
        System.out.println("please Enter  an integer:");
        int num= scan.nextInt();
        if (num<100){
            System.out.println("Won!");
        }else{
            System.out.println("Lost");
        }

    }
}
