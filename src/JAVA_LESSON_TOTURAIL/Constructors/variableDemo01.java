package JAVA_LESSON_TOTURAIL.Constructors;

public class variableDemo01 {

int x;
static int y=12;

    public static void main(String[] args) {
        new variableDemo01(5);
        variableDemo01 obj1=new variableDemo01(9);
        System.out.println(obj1.x+","+obj1.y);


    }

    variableDemo01(int i){
        x+=i;
        y+=i;
        System.out.println(y);
        System.out.println(x);
    }
}
