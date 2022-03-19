package JAVA_LESSON_TOTURAIL.SplitToturails;

import java.util.Arrays;

public class Q06 {

    public static void main(String[] args) {

        //Print the words ending with "y" or "Y"
        // (Make code case-insensitive)

        String st="Learn Java, earn money";
        st = st.replaceAll("\\p{Punct}","");

        String arr[]=st.split(" ");
        System.out.println(Arrays.toString(arr));

        for (String w:arr){
            if (w.endsWith("y")||w.endsWith("y")){
                System.out.println(w+" ");

            }
        }

    }
}
