package day28Abstraction;

public class AnimalRunner {
    public static void main(String[] args) {

              /*
            create 2 animals one Cat, one Sheep and
            make their sounds as necessary
            type their names
            then call them from your objects
             */

        Animal animal = new Sheep("sheep bleats as maa/baa","ilkan");

       animal.animalName();
       animal.animalSound();

        Animal animal2 = new Cat("Cats meow","Tom");

        animal2.animalSound();
        animal2.animalName();


        //what is the difference  between abstract class and regular class
        // abstract class cannot generate any object ve concrete class hv object
        // abstract class can


    }
}
