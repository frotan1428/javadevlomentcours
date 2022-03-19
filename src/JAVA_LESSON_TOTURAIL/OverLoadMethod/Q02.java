package JAVA_LESSON_TOTURAIL.OverLoadMethod;

public class Q02 {

    public static void main(String[] args) {

        System.out.println(min(3,6));
        System.out.println(min(3,6,7));
    }
    public static  int  min(int a,int b){
        return  a-b;
    }
    public static  int  min(int a,int b,int c){
        return  a-b+c;
    }
}
