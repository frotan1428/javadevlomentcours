package day27Exception;


import java.io.FileInputStream;
import java.io.IOException;
/*
   1) When we use throws in Method name line it means your telling to java "hey java if you need help let me know".
   2) After "throws" keyword in the method name line, you can use multiple Exceptions Classes like:
        throws IOExceptions,ArithmeticExceptions
   3) what is the difference between throws and throw Keywords
        a) "throws" can be used in Method name line but,"throw" can be used in the method Body
        b) After "throws" keyword you can use multiple Exceptions Class names.
           After "throw" you can use "new" keyword and Constructor of the Exception Class
        3) "throws"  keyword used to handle "Checked Exception". "throw" keyword is used  to throw exception whenever we want.
        4) What is the meanings of "final","Finally" and "Finalize" keywords?  ==>Homework...
 */

public class E04 {

    public static void main(String[] args) throws IOException {

            FileInputStream fis = new FileInputStream("src\\day27Exception\\File01.txt");
            int k;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

        System.out.println("==============");
            printTheAge(-12);

    }
    //Create a method with throw "IllegalArgumentException" for negative ages.

    public static void printTheAge( int age){
        if (age>=0){
            System.out.println(age);
        }else {
            throw new IllegalArgumentException("Ages cannot be Negative");
        }
    }

}