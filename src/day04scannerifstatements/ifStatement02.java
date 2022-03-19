package day04scannerifstatements;

import java.util.Scanner;

public class ifStatement02 {
    public static void main(String[] args) {
            //Ask user to enter an integer then
            //print "Even" if the integer is even
            //print "Odd" if the integer is odd
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to check its EVEN or ODD:");
        int num=scan.nextInt();
        //note:!true means false; != means does not equal;

        if (num%2==0){
            System.out.println("EVEN");
        }
        if (num%2!=0){
            System.out.println("ODD");
        }

    }
}
