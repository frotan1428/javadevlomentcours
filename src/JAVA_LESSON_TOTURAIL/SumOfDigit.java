package JAVA_LESSON_TOTURAIL;

public class SumOfDigit {

    public static void main(String[] args) {
        int n=123;
        int sumOfDigit=0;
        for (int i=n;i>0;i=i/10){

            sumOfDigit=sumOfDigit+i%10;
        }
        System.out.println(sumOfDigit);
    }

}
