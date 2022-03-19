package Paractice01;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
            /*
            A company decided to give bonus of 5% to employee if his/her year of
            service is 5 and more than 5 years.
            Ask user for their salary and year of service and print the net bonus amount.
            If employee can not get bonus, print how many more years he/she should work.

            EXAMPLE:
            INPUT   :   Year    => 4 year service
                        Salary  => 4000

            OUTPUT :  You need to work 1 year(s) to get bonus
             */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Year of service");
        int year=scan.nextInt();
        System.out.println("Enter Your Salary:");
        int salary=scan.nextInt();
         if(year<0 || salary<0){
             System.out.println("Please Enter Valid Data:");

         }else if(year>=0 && year<5){
             System.out.println("you should work :" +(5-year) +"year more to get the bonus ");
        }else{
            System.out.println("your bonus is:" + salary*5/100);
        }

    }
}
