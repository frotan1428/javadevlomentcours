package paractice04;

import java.util.Arrays;

public class SplitName {


    public static void main(String[] args) {

        String name="Ali Can";

        String Array[]=name.split(" ");
        System.out.println(Array[1]);

        ////Please split this name into a char array
          String name2="mohammad";
            char Array2[]=name2.toCharArray();
        System.out.println(Arrays.toString(Array2));






    }
}
