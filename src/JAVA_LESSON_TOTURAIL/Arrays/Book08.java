package JAVA_LESSON_TOTURAIL.Arrays;

import java.util.Arrays;

public class Book08 {


    public static void main(String[] args) {
        int Number[]={2,1,7,6};

        Arrays.sort(Number);

        for (int i=0;i<Number.length;i++){
            System.out.print(Number[i]+ " ");
        }

    }
}
