package JAVA_LESSON_TOTURAIL.NestedIfElseStatements;

public class Add {


    public static void main(String[] args) {
        System.out.println( add(12,13));
        System.out.println("The min:"+ min(12,13));

    }

    public static  int add(int a,int b){

        return a+b;
    }

    public static  int min(int a,int b){
        return a-b;
    }
}
