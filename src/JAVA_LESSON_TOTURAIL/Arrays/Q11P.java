package JAVA_LESSON_TOTURAIL.Arrays;

import java.util.Arrays;

public class Q11P {


    public static void main(String[] args) {


        int color[] = {12, 4, 5, 67, 34, 7, 8, 9, 13};
        //   System.out.println(Arrays.toString(color));// print array


        for (int w : color) {
            if (w == 9) {
                System.out.println(w + " " + "exist");
                break;
            }
        }

        Arrays.sort(color);
        System.out.println(Arrays.binarySearch(color, 15));

    }
}
