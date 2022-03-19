package JAVA_LESSON_TOTURAIL;

public class forLoop0p5 {
    public static void main(String[] args) {


        //Write a program to add counting numbers from 23 to 57 by using for-loop.
        //Print the sum on the console
        int sum=0;
        for (int i=23; i<57;i+=1){
            System.out.print(i+" "); //this is Print 23 t0 57;
            sum+=i;

        }
        System.out.println(sum);
    }
}
