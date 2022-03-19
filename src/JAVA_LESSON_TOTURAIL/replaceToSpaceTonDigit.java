package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class replaceToSpaceTonDigit {

    public static void main(String[] args) {

        System.out.println("Pleas Enter a Statements with SPace");
        Scanner scan=new Scanner(System.in);
        String str= scan.nextLine();
        String DiffFromSpace=str.replaceAll("[^ ]","1");
        System.out.println(DiffFromSpace);
        String noDiffFromSpace=str.replaceAll("","1");
        System.out.println(noDiffFromSpace);
    }
}
