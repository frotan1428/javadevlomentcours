package JAVA_LESSON_TOTURAIL;

public class Calculator {

    public  void  add(int...a){

        int sum=0;
        for (int w:a){
            sum=sum+w;
        }
        System.out.println(" the sum is: "+sum);
    }
    public  void  Product(int...b){

        int product=1;
        for (int w:b){
            product=product+w;
        }
        System.out.println("The Product is:"+product);
    }

    public  void  subtract(int a,int s){
        System.out.println("the subtract:"+(a-s));

    }

    public  void  division(int a,int s){

        System.out.println("the Division:"+(a/s));

    }


}
