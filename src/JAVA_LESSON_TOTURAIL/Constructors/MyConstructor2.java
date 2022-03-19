package JAVA_LESSON_TOTURAIL.Constructors;

public class MyConstructor2 {
    int x=3;
    int y=5;

    public static void main(String[] args) {

        MyConstructor2 sm1=new MyConstructor2(5,10);




    }
    MyConstructor2(){
        x+=1;
        System.out.println("-X"+x);

    }
    MyConstructor2(int i){
        this();
        this.y=i;
        x+=y;
        System.out.println("-X"+x);
    }
    MyConstructor2(int i,int i2){
        this(7);
        this.x=4;
        x+=y;
        System.out.println("-X"+x);
    }

}
