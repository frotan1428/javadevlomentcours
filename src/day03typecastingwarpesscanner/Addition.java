package day03typecastingwarpesscanner;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int firstNumber= scan.nextInt();
        System.out.println("Enter the Second Number");
        int secondNumber= scan.nextInt();
        System.out.println("the sum of firstNumber and SecondNumber: " +(firstNumber+secondNumber));
        System.out.println("the sub of firstNumber and SecondNumber: " +(firstNumber-secondNumber));
        System.out.println("the Mul of firstNumber and SecondNumber: " +firstNumber*secondNumber);
        System.out.println("the Div of firstNumber and SecondNumber: " +firstNumber/secondNumber);

    }
}
