package JAVA_LESSON_TOTURAIL.Arrays;

public class Q10 {


    //Find the sum off all elements in an array using For each loop [13, 12, 15, 20, 25]=85

    public static void main(String[] args) {

        int myArrays[] = new int[5];

        myArrays[0] = 13;
        myArrays[1] = 12;
        myArrays[2] = 15;
        myArrays[3] = 20;
        myArrays[4] = 25;
        int sum = 0;
        for (int w : myArrays) {
            sum = sum + w;
        }
        System.out.println(sum);

    }

    }
