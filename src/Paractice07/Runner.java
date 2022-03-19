package Paractice07;

import JAVA_LESSON_TOTURAIL.C;

public class Runner {

    public static void main(String[] args) {

        Circle circle=new Circle(2);
        System.out.println("Circle Radius:"+circle.getRadius());
        System.out.println("The Area of Circle:" +circle.getArea());

        Circle circle1=new Circle(-2);
        System.out.println("Circle Radius:"+circle1.getRadius());
        System.out.println("The Area of Circle:" +circle1.getArea());

        Cylinder cylinder=new Cylinder(2,6);
        System.out.println("Cylinder radius :"+cylinder.getRadius());
        System.out.println("Cylinder Area: "+cylinder.getArea());
        System.out.println("Cylinder Volume: "+cylinder.getVolume());

        Cylinder cylinder1=new Cylinder(2,-5);// Because of "-" the result will be zero
        System.out.println("Cylinder Volume: "+cylinder1.getVolume());


    }
}
