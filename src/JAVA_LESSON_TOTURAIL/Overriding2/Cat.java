package JAVA_LESSON_TOTURAIL.Overriding2;

public class Cat extends Animals{

    String catName="Pink";
    @Override
   public  void eat() {

        System.out.println("Cat eats");
    }

    @Override
    public void drink() {
        System.out.println("Cat drink");

    }
}
