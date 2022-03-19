package JAVA_LESSON_TOTURAIL.Constructors;

public class ExampleConstructor01 {

int price;
String model;
int year;
    public static void main(String[] args) {

        ExampleConstructor01 car= new ExampleConstructor01();
        car.price=200;
        car.model="Honda";
        car.year=2022;

        System.out.println(car.year+ car.model+ car.price);
    }
    public ExampleConstructor01(){
        this.price=price;
        this.model=model;
        this.year=year;
    }


}
