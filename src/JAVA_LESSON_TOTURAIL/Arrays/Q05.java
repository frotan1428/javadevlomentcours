package JAVA_LESSON_TOTURAIL.Arrays;

public class Q05 {

    //Print the sum of the first and the last element in an array on the console 13+25=38

    public static void main(String[] args) {
        int myArrays[]=new int[5];

        myArrays[0]=13;
        myArrays[1]=12;
        myArrays[2]=15;
        myArrays[3]=20;
        myArrays[4]=25;
       int firstElement=myArrays[0];
       int indexOfLastElement=myArrays.length-1;
       int lastElements=myArrays[indexOfLastElement];

        System.out.println(firstElement+lastElements);//38



    }
}
