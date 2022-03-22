package day29Interfacemanipulation;

public abstract class ElectricalVehicles implements AirCondition{


    /*
        Abstract Clas can have method and non-abstract class method, so we can override an implements
        supper class or inheritance method in abstract class
        but this is cannot be achieved in interface
     */

    @Override
    public void electronicAc() {
        System.out.println("Electronic vehicle Ac..");
    }

    @Override
    public void bacteriaKiller() {
        System.out.println("Electronic vehicle bacteriaKiller..");
    }




}
