package day28Abstraction2;

public class CalculatorRunner {

    public static void main(String[] args) {

        Calculator cal=new Profit();
        //polymorphism.inheritance.abstraction
        System.out.println(cal.addition(4,5));
        System.out.println(cal.multiplication(2,3));
        System.out.println(cal.subtraction(3,4));


        Calculator cal2=new Loss();
           System.out.println(cal2.subtraction(2,4));
           System.out.println(cal2.division(5,2));

    }
}
