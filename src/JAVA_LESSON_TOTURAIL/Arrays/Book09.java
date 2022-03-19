package JAVA_LESSON_TOTURAIL.Arrays;

import java.util.Arrays;

public class Book09 {

  //ascending   order
    public static void main(String[] args) {
      String srr[]={"Mohammad","Hafasa","FROTAN","MUSLEH"};

        Arrays.sort(srr);

        for (int i=0;i<srr.length;i++){
            System.out.print(srr[i]+ " ");
        }


    }
}
