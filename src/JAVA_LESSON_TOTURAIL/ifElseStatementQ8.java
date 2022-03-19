package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class ifElseStatementQ8 {
    public static void main(String[] args) {

        /*
            Type java code by using if-else statement.
                A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
                Ask user for quantity and unit price then judge and print total cost for user.
                If the quantity is less than 1000 output will be “No discount.”
           */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a Cost:");
        double quantity=scan.nextDouble();

            double dis, amount,s;
            dis=10;
        System.out.println("this cost:"+quantity);
        System.out.println("discount-rate"+dis);
          s=100-dis;
         amount =(s*quantity)/100;
         if (quantity>1000){
            System.out.println("amount after dis account:"+amount);
         }else{
            System.out.println("no discount");
         }




    }
}
