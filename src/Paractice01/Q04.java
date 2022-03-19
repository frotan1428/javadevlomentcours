package Paractice01;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
            Ask user to enter a number. If the number is less than 10 and greater
            than or equal to 0, calculate its cube. Otherwise, calculate its square.
            Cube of a = a*a*a Square of a = a*a
           */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a number");

        int num=scan.nextInt();
        //if Statements
        if (num<10 && num>=0 ){
            System.out.println(num*num*num);
        }else{
            System.out.println(num*num);
        }
        //Ternary Statements
       // int result= num>=0 && num<10    ? num*num*num   : +num*num;
        System.out.println(num>=0 && num<10    ? "The cube is :" + num*num*num   :   "the Square:" +num*num);
    }
}
