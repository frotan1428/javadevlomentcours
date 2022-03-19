package ParacticeSession01;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Perform some mathmetical operation using 2 numbers only");
        int num1 = scan.nextInt();
        Character op = scan.next().charAt(0);
        int num2 = scan.nextInt();
        switch (op){
            case '+':
                int result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                int result1 = num1 - num2;
                System.out.println(result1);
                break;
            case '*':
                int result2 = num1 * num2;
                System.out.println(result2);
                break;
            case '/':
                int result3 = num1 / num2;
                System.out.println(result3);
                break;
            default:
                System.out.println("please enter the correct operation");
        }

    }




}
