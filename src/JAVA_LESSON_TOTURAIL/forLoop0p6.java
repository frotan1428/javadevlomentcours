package JAVA_LESSON_TOTURAIL;

public class forLoop0p6 {

    public static void main(String[] args) {

        //Write a program to multiply counting numbers from 7 to 15 by using for-loop.
        //Print the multiplication on the console
            int Product=1;
        for (int i=7; i<15; i+=1){

            System.out.println(i +" ");
            Product=Product*i;

        }
        System.out.println("Prodcut is:" + Product);
    }
}
