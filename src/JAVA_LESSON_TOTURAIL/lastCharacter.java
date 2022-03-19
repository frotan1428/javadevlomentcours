package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class lastCharacter {
    public static void main(String[] args) {
        System.out.println("Please Enter any String");
        Scanner scan=new Scanner(System.in);
        String st=scan.next();
        char isNewChar=st.charAt(st.length()-1);
        System.out.println("The Last Character is:"+isNewChar);
    }

}

