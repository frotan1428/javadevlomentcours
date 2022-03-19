package JAVA_LESSON_TOTURAIL.ForLoop;

public class Q07 {


    //Write a program to multiply counting numbers from 7 to 15 by using for-loop.
    //Print the multiplication on the console
    public static void main(String[] args) {

        int product=1;
        for (int i=7;i<15;i++){

            product=product*i;

        }
        System.out.println("The Multiplication 7-15:"+product);
    }
}
