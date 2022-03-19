package Paractice06;

public class CalculatorRunner {

    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.add(5,6);//The sum is: 11.0
        cal.subtraction(10,15);//The difference is:-5.0
        cal.multiply(10,12);//The Product  is : 23.0
        cal.division(1,0);
    }

}
