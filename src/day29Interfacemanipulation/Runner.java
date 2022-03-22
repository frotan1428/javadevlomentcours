package day29Interfacemanipulation;

public class Runner {

    public static void main(String[] args) {


        HybridEngine hybridEngine=new Car();

        hybridEngine.havingHybridEngine();
        hybridEngine.move();

        Car car=new Car();
        System.out.println(car.power());

        car.move();


    }
}
