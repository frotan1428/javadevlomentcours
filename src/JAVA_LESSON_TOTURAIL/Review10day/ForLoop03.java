package JAVA_LESSON_TOTURAIL.Review10day;

public class ForLoop03 {

    public static void main(String[] args) {

        /*
           Type code to check if a given String is Palindrome.
           String: anna  Reversed String: anna
         */

            String s="noon";

            String palindrome="";

            for (int i=s.length()-1;i>-1;i--){
                palindrome=palindrome+s.charAt(i);
            }

         if (s.equals(palindrome)){
             System.out.println("palindrome");
         }else{
             System.out.println("not Planidrome");
         }

    }
}
