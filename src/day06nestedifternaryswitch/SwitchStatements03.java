package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatements03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number...");
        int monthNumber = scan.nextInt();

            /*

            If user Enters 9 the code will print October, november ,december
            If User Enter 5 The Code will Be Print May,june,July, August,October,December
             */
        //

        switch (monthNumber){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("Jun");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("The Number is Out of The Month Range:Put Number 1-12");

        }




    }
}
