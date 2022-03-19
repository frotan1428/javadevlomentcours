package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatements04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day First Number");
        Double firstNumber = scan.nextDouble();


        System.out.println("Enter day Second  Number");
        double secondNumber = scan.nextDouble();

        //Create a simple Calculator which does Addition .Subtraction,Multiplication,Division,and percentage Calculation:

        System.out.println("Select Operations: +,-,*,/,%");
        //Noe:to get a single character from usr we type that code:====>scan.next().charAt(0);
        char operation=scan.next().charAt(0);

        switch (operation){
            case '+':
                System.out.println(firstNumber+secondNumber);
                break;
            case '-':
                System.out.println(firstNumber-secondNumber);
                break;
            case '*':
                System.out.println(firstNumber*secondNumber);
                break;

            case '%':
                System.out.println(firstNumber*secondNumber/100);
                break;
            default:
                System.out.println("Just Enter Number :");

        }
        /*

        Note: In Switch method  parenthesis you can use Just the following data types
        a)int  b)byte   c)short  d)String
        Note: In Switch method  parenthesis you can not use Just the following data types
        a)long  b)double   c)float  d)boolean
         */
    }
}
