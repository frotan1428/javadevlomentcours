package JAVA_LESSON_TOTURAIL.Constructors;

public class Car {

    public static void main(String[] args) {
        Car c1=new Car("ToYUTA","Corolla",9000);
        Car c2=new Car("ToYUTA","Corolla");
        Car c3=new Car();
        c3.model="TOYTO";
        c3.name="Crololla";


    }

    String model;
    String name;
    int Price;
    public Car(String model,String name,int price){
        this.model=model;
        this.name=name;
        this.Price=price;

    }
    public Car(String model,String name){
        this.model=model;
        this.name=name;


    }
    public Car(){

    }
}
