package JAVA_LESSON_TOTURAIL.Arrays;

import java.util.Arrays;

public class Q02 {

    public static void main(String[] args) {

        int myArrays[]=new int[5];

        //How to assign a value to a specific array element
       /*
        System.out.println("==========All array elements==========");
        myArrays[0]=13;
        myArrays[1]=12;
        myArrays[2]=15;
        myArrays[3]=20;
        myArrays[4]=25;
        System.out.println(Arrays.toString(myArrays));//[13,12,15,20,25]
        */
        System.out.println("==========Specific  array elements==========");
        myArrays[1]=45;
        System.out.println(Arrays.toString(myArrays));//[0,45,0,0,0]
        myArrays[0]=13;
        System.out.println(Arrays.toString(myArrays));//[13,45,0,0,0]
        myArrays[2]=15;
        System.out.println(Arrays.toString(myArrays));//[13,45,15,0,0]
        myArrays[3]=17;
        myArrays[4]=18;
        System.out.println(Arrays.toString(myArrays));//[13,45,15,17,18]



    }
}
