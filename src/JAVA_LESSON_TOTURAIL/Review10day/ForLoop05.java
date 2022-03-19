package JAVA_LESSON_TOTURAIL.Review10day;

public class ForLoop05 {

    public static void main(String[] args) {

        /*
           Type code to check if a given integer is Palindrome.
          Integer: 12321  Reversed Integer: 12321
        */
        int num=121;
        String resNumber="";
        String fromNumber=String.valueOf(num);

        for (int i=fromNumber.length()-1;i>-1;i--){
            resNumber=resNumber+fromNumber.charAt(i);

        }
      if (fromNumber.equals(resNumber)){
          System.out.println("palindrome");
      }else{
          System.out.println("not palindrome");
      }



    }
}
