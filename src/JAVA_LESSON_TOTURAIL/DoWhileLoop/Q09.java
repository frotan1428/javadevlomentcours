package JAVA_LESSON_TOTURAIL.DoWhileLoop;

public class Q09 {

    public static void main(String[] args) {

        //Write a program to print letters from c to m on the console by using do-while loop.
        char ch='c';
        char ch2='m';
        do {
            System.out.println(ch);
            ch++;
        }while (ch<ch2);
        System.out.println(ch2);
    }
}
