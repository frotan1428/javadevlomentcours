package day10forLoopWhileLoop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {
        //1.Example: Type code to print "Hello!" 5 times on the console
                //1.way: for Loop:
        for (int i=1;i<5;i++){
            System.out.println("Hello");
        }
        System.out.println("______");
        //2.way while Loop;
        int i=1;
        while (i<5){
            System.out.println("hello");
            i++;

        }
   //.Example Type code to print odd integer from 12 to 67 line with Space between them:
        int odd=12;
        while (odd<68){
            if (odd%2!=0)
            System.out.print(odd+" ");
            odd++;

        }
        //3.Example Type code to sum from 12 to 67

        int m=12;
        int sum=0;
        while (m<68){

            sum=sum+m;
            m++;

        }
        System.out.print("Sum is 12-67:"+sum);
        /*
        Type java code by using while loop,
         Write a program that prompts the user to input an integer.
         It should then find the sum of the digits of that number.
         123 ==> 1+2+3 = 6
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter an Integer:");
        int num=scan.nextInt();
        int sumOfDigit=0;

        while (num>0){
            sumOfDigit=sumOfDigit+num%10;

            num=num/10;

        }
        System.out.println(sumOfDigit);
        /*

        /*
		 Type java code by using while loop,
	     Write a program that prompts the user to input a number.
	     It should then print the multiplication table of that number.

	     3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30

         */
        int x=3;
        int y=1;
        while (y<11){

            System.out.println(x+"x"+y+ "="+x*y);

            y++;
        }

    }
}
