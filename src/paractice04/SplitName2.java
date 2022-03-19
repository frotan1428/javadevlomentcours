package paractice04;

import java.util.Arrays;

public class SplitName2 {
    public static void main(String[] args) {


        String name = "M o h a m m a d M u s t a f a";
        //split method only works with String array

        //Please split this name into a char array


        String [] namesChars = name.split(" ");


        System.out.println(Arrays.toString(namesChars));
        String chars = "";
        for(String each: namesChars){

            // System.out.println(each);
            chars += each;
            //M, o, h,a
        }

        char [] charArray = chars.toCharArray();

        System.out.println(Arrays.toString(charArray));




    }

}
