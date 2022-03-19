package JAVA_LESSON_TOTURAIL.DoWhileLoop;

public class Q08 {
    public static void main(String[] args) {


        //Write a program to print numbers which are divisible by 5 between 1 and 100 on the console
        //by using do-while loop.
        int num=1;


        do {
            if (num%5==0)
            System.out.println(num);
            num++;
        }while (num<100);

    }
}
