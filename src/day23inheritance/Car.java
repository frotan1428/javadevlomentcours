package day23inheritance;

public class Car extends Motorized{


    public Car(String make){
        super(16);
        System.out.println("Car Constructor  With String  parameter");
    }
    public Car(int price){
        super(20);
        System.out.println("Car Constructor  With Integer  parameter");
    }

}
