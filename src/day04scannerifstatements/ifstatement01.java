package day04scannerifstatements;

import java.util.Scanner;

public class ifstatement01 {
    public static void main(String[] args) {
        /*Ask user to enter an integer, then
        1) print "Positive" on the console if the number is positive
        2) print "Negative" on the console if the number is negative
        3)print "Neuter" on the console if the number is zero

        if you want to run different codes condition you should use"if statements."
        //all keyword in java is lowercase's
         */
        // if it reins, I will cancel the picnic;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to check its sign:");
        int num=scan.nextInt();

        if (num>0){
            System.out.println("positive");

        }
        if (num<0){
            System.out.println("Negative");

        }
        if (num==0){
            System.out.println("Neuter");

        }
    }
}
