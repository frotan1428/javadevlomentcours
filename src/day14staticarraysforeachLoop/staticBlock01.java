package day14staticarraysforeachLoop;

public class staticBlock01 {

     static  double pi;
     static double eNumber;

     public staticBlock01(){

         System.out.println("Constructors");
     }

     static {//1
         pi=3.14;
         System.out.println("First static block");

     }
    static {//2
        System.out.println("Second static block");

        eNumber=2.7;
    }
    public static void main(String[] args) {
        // when you click on main method run button ,class loader will be active then it will  load the class into memory
        /*
          sometime we need some data just after the class loaded
          For that kind of scenario we use static block;
          When we use static block  it will be executed before "main method" ,"any other method","constructor",I mean it will be the first to execute

          Not:static block is used to initialize "static variables" when we want them before everything in the class.

          Note: if you have multiple static block  execution will be from top to down.
         */
            double r=2;
            double area=pi*r*r;
            staticBlock01 obj1=new staticBlock01();
        System.out.println("area");



    }

}
