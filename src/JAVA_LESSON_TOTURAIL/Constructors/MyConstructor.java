package JAVA_LESSON_TOTURAIL.Constructors;

public class MyConstructor {

    int x=9;

    public static void main(String[] args) {

        MyConstructor sm1=new MyConstructor(12);
        System.out.println(sm1.x);



    }
    MyConstructor(){

        System.out.println("-X"+x);

    }
    MyConstructor(int x){

        System.out.println("-X"+x);

    }

}
