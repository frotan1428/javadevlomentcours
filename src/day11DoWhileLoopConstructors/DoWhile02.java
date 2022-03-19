package day11DoWhileLoopConstructors;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {

        /*
	 	  Ask user to enter an integer.
		  If the integer is less than 100, tell user “Won!”
		  Otherwise, tell user “Lost!”
	 */
        Scanner scan=new Scanner(System.in);

        int n=0;
        do {
            System.out.println("Please Enter an Integer");
            n=scan.nextInt();
           if (n<100){
               System.out.println("Won");
           }

        }while (n<100);
        System.out.println("Lost!");

    }
}
