package JAVA_LESSON_TOTURAIL.Overriding;

public class B extends A{
    int i=12;

    @Override
    public void display() {
        System.out.println(i);
    }
}
