package day29Interfacemanipulation;

public class Tesla extends ElectricalVehicles implements Vehicle{


    @Override
    public void climateAc() {
        System.out.println("The Tesla Ac present ");
    }

    @Override
    public void run() {
        System.out.println("The Tesla RunPerform");
    }
}
