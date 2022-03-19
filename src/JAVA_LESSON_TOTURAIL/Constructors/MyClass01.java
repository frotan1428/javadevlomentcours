package JAVA_LESSON_TOTURAIL.Constructors;

public class MyClass01 {

int x=12;
int y=12;

    public static void main(String[] args) {
        MyClass01 cm1=new MyClass01();
        MyClass01 cm2=new MyClass01(1,5);
        System.out.println(cm2.y);



    }
    public MyClass01(){
        x+=1;
      //  System.out.println("-X"+x);

    }
    public MyClass01(int i){
        this();
        this.y=i;
        System.out.println("-X"+x);
    }
    public MyClass01(int i,int i2){

        this.x=4;
        this.y=7;
        System.out.println("-X"+x);
        System.out.println(y);
    }


}
