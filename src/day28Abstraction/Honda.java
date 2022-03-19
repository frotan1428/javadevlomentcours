package day28Abstraction;

public class Honda extends Car{

    String make="Honda";
    String model="Accord";
    int year =2021;
    @Override
    public void make() {
        System.out.println("My car is "+make);

    }

    @Override
    public void model() {
        System.out.println("My car is an "+model+" Model");
    }

    @Override
    public void year() {
        System.out.println("My car is "+year);
    }
}
