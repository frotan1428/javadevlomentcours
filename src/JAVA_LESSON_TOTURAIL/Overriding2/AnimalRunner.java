package JAVA_LESSON_TOTURAIL.Overriding2;

public class AnimalRunner {

    public static void main(String[] args) {


        Animals animals=new Animals();

        animals.drink();
        animals.eat();



        Cat cat =new Cat();
        System.out.println(cat.catName);
        cat.drink();
        cat.eat();
    }
}
