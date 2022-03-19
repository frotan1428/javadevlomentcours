package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class subString {

        public static void main(String[] args) {

            System.out.println("Please Enter Any String");
            Scanner scan=new Scanner(System.in);

           String st1=scan.nextLine().substring(0,1);// like chart(0) method
            System.out.println(" First Character:"+st1);

            String st2=scan.next();
            String lastChar=st2.substring(st2.length()-1,st2.length());
            System.out.println("Last Character:"+lastChar);


        }
}
