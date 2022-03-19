package JAVA_LESSON_TOTURAIL.Constructors;

public class ExampleConstructor02 {

    int price;
    String model;
    int year;

    public static void main(String[] args) {
        ExampleConstructor02 car1=new ExampleConstructor02(200,"TOYOTA",2022);

        System.out.println(car1.model+" ,"+car1.price+","+car1.year);

    }

    public ExampleConstructor02(int price,String model,int year){
        this.price=price;
        this.model=model;
        this.year=year;


    }
}
