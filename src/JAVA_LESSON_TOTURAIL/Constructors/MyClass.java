package JAVA_LESSON_TOTURAIL.Constructors;

public class MyClass {


    int num;
    String name="ALi";

    public static void main(String[] args) {

        System.out.println(add(5,6));
        System.out.println(product(5));


    }

    public static int add(int num1,int mum2){
        num1++;
        num1--;
       return num1+mum2;

    }
    public static int product(int num2){

        return num2*num2;

    }
}
