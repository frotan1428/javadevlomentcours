package Paractice06;

public class Calculator {

         /*
              Create a basic calculator, create add, subtract, multiply, divide methods.
              You can use varargs for addition and multiplication
              Create a Runner class...
         */
    //1
     public  void add(double...v){
          double sum=0;
          for (double w:v){
              sum=sum+w;
          }
         System.out.println("The sum is: " +sum);

     }
     //2
    public static void subtraction(double a, double b){
        System.out.println("The diffrence is:"+(a-b));

    }

    //3
    public  void multiply(double...a){
        double product=1;
        for (double w:a){
            product=product+w;
        }
        System.out.println("The Product  is :" +product);

    }
    //4
    public  void division(double a, double b){

      if (b%2==0){
          System.out.println("i can not calculate");
      }else{
          System.out.println("the divide is: " +a/b);
      }

    }

}
