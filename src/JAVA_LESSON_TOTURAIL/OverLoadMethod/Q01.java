package JAVA_LESSON_TOTURAIL.OverLoadMethod;

public class Q01 {

    public static void main(String[] args) {


        System.out.println(add(3,5));
        System.out.println(add(4,3.5));
        System.out.println(product(3,5));

    }

   public static int add(int a,int b){
        return a+b;
    }

    public static int product(int a,int b){
        return a*b;
    }
    public static double add(double a,double b){
        return a-b;
    }
}
