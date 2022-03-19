package JAVA_LESSON_TOTURAIL.Constructors;

public class MethodOverLoading {


    public static void main(String[] args) {
        System.out.println(add(3,4));// with 2 parameter.
        System.out.println(add(3,4,5));//with 3 parameter.
        System.out.println(add(3.5,4));


    }
    public static int add( int a,int b){
        return a+b;
    }
    public static int add( int a,int b,int c){
        return a+b+c;
    }
    public static double add(double a, double b){
        return a+b;
    }
}
