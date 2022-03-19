package JAVA_LESSON_TOTURAIL.DoWhileLoop;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Password");
        String password=scan.next();
        do {

            if (!(password.equals("password"))){
                System.out.println("False");
            }
        }while (!(password.equals("password")));
        System.out.println("true");
    }
}
