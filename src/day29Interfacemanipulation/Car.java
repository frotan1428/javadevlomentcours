package day29Interfacemanipulation;


public class Car implements  AirCondition,HybridEngine{


    @Override
    public void electronicAc() {
        System.out.println("The Car Ac is electronic..");
    }

    @Override
    public void climateAc() {
        System.out.println("The Car AC is Climate AC....");
    }

    @Override
    public void bacteriaKiller() {
        System.out.println("The Car AC Kills 99% of the bacteria ");
    }

    @Override
    public void run() {

        System.out.println("The Car AC is run Perfectly");

    }

    @Override
    public void havingHybridEngine() {
        System.out.println("The Car engine is Hybrid");

    }
}
