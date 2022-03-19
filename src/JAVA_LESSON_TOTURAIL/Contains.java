package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {


        System.out.println("Please Enter Any String");
        Scanner scan=new Scanner(System.in);
        String CharacterToCheck=scan.next();

        boolean contain= CharacterToCheck.contains("x");
        System.out.println(contain);
        if(contain){
            System.out.println("The character exist");
        }else{
            System.out.println("The character does not  exist");
        }

    }
}
