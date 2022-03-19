package JAVA_LESSON_TOTURAIL.Arrays;

import java.util.Arrays;

public class Book02 {

    public static void main(String[] args) {

        //how to initialize  an array

        int myArray[]=new int[3];

        myArray[0]=12;
        myArray[1]=13;
        myArray[2]=14;

        System.out.println(myArray[2]);

        //or
        int myArray2[]={12,13,14};
        System.out.println(Arrays.toString(myArray2));
        for (int w:myArray2){
            System.out.println(w);
        }

    }
}
