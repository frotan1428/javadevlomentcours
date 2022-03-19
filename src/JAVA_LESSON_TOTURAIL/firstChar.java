package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class firstChar {
    public static void main(String[] args) {
        System.out.println("Please Enter any String");
        Scanner scan=new Scanner(System.in);
        String st=scan.next();
        char isNewChar=st.charAt(0);
        System.out.println("The First Character is:"+isNewChar);
    }
}
