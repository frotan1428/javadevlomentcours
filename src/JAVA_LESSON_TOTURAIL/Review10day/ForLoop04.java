package JAVA_LESSON_TOTURAIL.Review10day;

import java.util.Scanner;

public class ForLoop04 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a String:");
        String st= scan.next();
        String ps="";
        for (int i=st.length()-1;i>-1;i--){
            ps=ps+st.charAt(i);

        }
       if (st.equals(ps)){
           System.out.println("palindrome");
       }else{
           System.out.println("not Palindrome");
       }
    }
}
