package JAVA_LESSON_TOTURAIL.SplitToturails;

import java.util.Arrays;

public class Q02 {

    public static void main(String[] args) {

        //Put each word to an array as an element

        String name = "Sevval#Mustafa#Suat#Fatmanur";

        String sentence[]=name.split("#");
        System.out.println(Arrays.toString(sentence));

        String sentence1 = "Learn Java earn money";
        String st[]=sentence1.split(" ");
        System.out.println(Arrays.toString(st));

        char st2[]=sentence1.toCharArray();
        System.out.println(Arrays.toString(st2));


        //I go to school and I talk to friends and I talk to teachers
        //Please separate each sentence from "and" put them in an array.

        String sent="I go to school and I talk to friends and I talk to teachers";

        String sent1[]=sent.split("and");
        System.out.println(Arrays.toString(sent1));

    }
}
