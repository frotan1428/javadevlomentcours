package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class UpdateWord {


    public static void main(String[] args) {

       UpdateWord("Kan","SALMA");


    }
    public  static void UpdateWord(String s,String t){

        s= s.substring(0,1).toUpperCase()+t.substring(2);
        System.out.println(s);

    }
}
