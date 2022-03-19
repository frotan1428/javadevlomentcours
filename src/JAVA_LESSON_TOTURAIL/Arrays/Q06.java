package JAVA_LESSON_TOTURAIL.Arrays;

public class Q06 {


    // print the First and Last  element of array.
    public static void main(String[] args) {

        int myArrays[]=new int[5];

        myArrays[0]=13;
        myArrays[1]=12;
        myArrays[2]=15;
        myArrays[3]=20;
        myArrays[4]=25;

        int firstElement=myArrays[0];
        System.out.println(firstElement);
        int lastElementOfArray=myArrays.length-1;
        //System.out.println(myArrays[myArrays.length-1]);
        System.out.println(myArrays[lastElementOfArray]);
    }
}
