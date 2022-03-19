package JAVA_LESSON_TOTURAIL.IfElseStatements;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {


          /*
                Type java code by using if-else if() statement,
            if both of the two integers are positive, output will be the sum of them.
            If both of the two integers are negative, output will be the multiplication of them.
            Otherwise,; output will be “I cannot add or multiply different signed numbers”

          */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter 2 integer:");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int sum=0;
        int product=1;

        if (num1>=0 && num2>=0){
            System.out.println(num1+num2);

        }else if(num1<0 && num2<0){
            System.out.println(num1*num2);
        }else{
            System.out.println("I cannot add or multiply different signed numbers");
        }
    }
}
