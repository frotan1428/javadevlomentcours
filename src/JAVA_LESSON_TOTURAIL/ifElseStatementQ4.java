package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class ifElseStatementQ4 {
    public static void main(String[] args) {

        /*
        Ask user to enter a character, then check whether the character is alphabet or not
         */
        Scanner scan=new Scanner(System.in);
        String ch=scan.next();
        if (ch.equals("S") ||ch.equals("A")){
            System.out.println("this is alphabet");
        }else{
            System.out.println("no alphabet");
        }

    }
}
