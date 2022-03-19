package JAVA_LESSON_TOTURAIL.DoWhileLoop;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        /*

        Ask user to enter a name.
            If the name contains the letter ‘a’ then print "Won!" on the console
            otherwise ask user to enter another name.
            Use do-while loop.
         */
        int counter=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Your Name");

        String CharacterToCheck=scan.next();

        do {
            if (counter==1){
                System.out.println("Please Enter Your Name");
                CharacterToCheck=scan.next();
                break;
            }
            if (CharacterToCheck.contains("a")){
                System.out.println("won!");

               break;
            }
            counter++;
        }while (counter<2);


    }
}
