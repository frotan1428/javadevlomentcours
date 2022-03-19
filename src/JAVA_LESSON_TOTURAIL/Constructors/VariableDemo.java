package JAVA_LESSON_TOTURAIL.Constructors;

public class VariableDemo {

    static int count=12;
    public void increment(){
        count++;
    }

    public static void main(String[] args) {
        VariableDemo obj1=new VariableDemo();
        VariableDemo obj2=new VariableDemo();
        obj1.increment();
        obj2.increment();
        System.out.println("obj1 :obj1 is:"+obj1.count);
        System.out.println("obj1 :obj2 is:"+obj2.count);


    }
}
