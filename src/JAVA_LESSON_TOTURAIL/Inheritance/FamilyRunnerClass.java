package JAVA_LESSON_TOTURAIL.Inheritance;

public class FamilyRunnerClass {

    public static void main(String[] args) {




        System.out.println("---------");
        Son1 son1=new Son1();
        son1.Money();

        System.out.println("---------");
        Son2 son2=new Son2();
        son2.Money();


        System.out.println("---------");
        Son3 son3=new Son3();
        son3.Money();

        System.out.println("---------");
        Son1Boy son1Boy=new Son1Boy();
        son1Boy.Money();
        son1Boy.MotorBike();

        System.out.println("---------");

        Son2Boy son2Boy=new Son2Boy();
        son2Boy.Money();
        son2Boy.bicycle();

        System.out.println("---------");

        Son3Boy son3Boy=new Son3Boy();
        son2Boy.Money();
        son3Boy.Car();

        System.out.println("---------");
        Son1Girl son1Girl=new Son1Girl();
        son1Girl.Money();
        son1Girl.MotorBike();

        System.out.println("---------");

        Son2Girl son2Girl=new Son2Girl();
        son2Girl.Money();
        son2Girl.bicycle();
        System.out.println("---------");
        Son3Girl son3Girl=new Son3Girl();
        son3Girl.Money();
        son3Girl.Car();

        Family family=new Family();
        family.Money();

    }
}
