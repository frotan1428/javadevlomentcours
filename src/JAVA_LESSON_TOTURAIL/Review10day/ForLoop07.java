package JAVA_LESSON_TOTURAIL.Review10day;

import java.util.Scanner;

public class ForLoop07 {
    public static void main(String[] args) {

        //Example: Type code to find the sum of the unique digits of an integer.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int p = scan.nextInt();
        String pS = String.valueOf(p);
        int sumOfUniqueDigits = 0;

        for(int i=0; i<pS.length(); i++){
            char c = pS.charAt(i);
            //  String c= pS.substring(i,i+1);;

            if(pS.indexOf(c)==pS.lastIndexOf(c)){
                sumOfUniqueDigits = sumOfUniqueDigits + Integer.valueOf(c + "");//If you put char inside the valueOf() you will get ASCII value
            }
        }
        System.out.println(sumOfUniqueDigits);
    }
}
