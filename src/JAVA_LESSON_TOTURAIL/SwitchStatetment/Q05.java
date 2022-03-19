package JAVA_LESSON_TOTURAIL.SwitchStatetment;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

                 /*
               Type java code by using switch statement.
            A school has the following rules for grading system:
            1. For 50 - C 2. For 80 - B. 4. For 100 - A
                     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter Grade;");
        int grade=scan.nextInt();

        switch (grade){
            case 100:
                System.out.println("A");
                break;
            case 80:
                System.out.println("B");
                break;
            case 70:
                System.out.println("C");
                break;
            case 60:
                System.out.println("D");
                break;
            default:
                System.out.println("Grade Failed");
        }
    }
}
