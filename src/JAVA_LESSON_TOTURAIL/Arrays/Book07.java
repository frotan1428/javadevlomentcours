package JAVA_LESSON_TOTURAIL.Arrays;

import java.util.Arrays;

public class Book07 {
        //how to sort an array?
    public static void main(String[] args) {

        int Number[]={9,8,7,6,5,4,3,2,1};

        Arrays.sort(Number);

        for (int i=0;i<Number.length;i++){
            System.out.print(Number[i]+ " ");
        }

    }
}
