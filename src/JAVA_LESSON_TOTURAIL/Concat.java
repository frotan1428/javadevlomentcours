package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {

        //concat getData
        Scanner scan=new Scanner(System.in);
        System.out.println("Please First String");
        String Str= scan.next();
        System.out.println("Please First String");
        String str2= scan.next();
        System.out.println("Please third String");
        String str3= scan.next();
        String newStr=Str.concat(str2).concat(str3);
        System.out.println(newStr);

    }
}
