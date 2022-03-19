package JAVA_LESSON_TOTURAIL.Review10day;

public class ForLoop06 {

    public static void main(String[] args) {

        //Example: type code to find the sum of digit of an integer;
        int digit=123;
        int sumOdDigit=0;
        for (int i=digit;i>0;i=1/10){
            sumOdDigit=sumOdDigit+i%10;
        }
        System.out.println(sumOdDigit);
    }
}
