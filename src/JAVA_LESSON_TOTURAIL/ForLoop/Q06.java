package JAVA_LESSON_TOTURAIL.ForLoop;

public class Q06 {


    //Write a program to add counting numbers from 23 to 57 by using for-loop.
    //Print the sum on the console

    public static void main(String[] args) {
   int sum=0;
        for ( int i=23; i<57;i++){
            sum=sum+i;
        }
        System.out.println("The sum number 23-57:"+sum);
    }
}
