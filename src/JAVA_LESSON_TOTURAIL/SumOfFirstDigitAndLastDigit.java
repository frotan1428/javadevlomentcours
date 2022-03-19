package JAVA_LESSON_TOTURAIL;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class SumOfFirstDigitAndLastDigit {

    public static void main(String[] args) {
                /*

                        Ask user ta enter a 4 digits integer, then print the sum of the first
                    and the last digit of the number on console.
                    For example; if user enters 1234 you will add 1 and 4,
                    then print on the console 5
                */
        int sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a integer");
        int lastDigit=0,FirstDigit=0,SumDigit=0;
        int num=scan.nextInt();
         lastDigit=num%10;
        System.out.println("Last Digit:"+lastDigit);
      while (num!=0){
         FirstDigit=num%10;
         num/=10;
      }
         System.out.println("First Digit:"+FirstDigit);
         SumDigit=FirstDigit+lastDigit;
         System.out.print("Sum Of first Digit and Last Digit:"+SumDigit);
    }
}
