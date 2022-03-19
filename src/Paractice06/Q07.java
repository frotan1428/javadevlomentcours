package Paractice06;

public class Q07 {

    //Write a code that adds given integers except the first one
    // and multiplies with the first integer.


    public static void main(String[] args) {

       method(2,1,2);
       method(5,1);

    }
    public static void method(int first, int...numbers){

        int sum=0;
        for (int w:numbers){
            sum=sum+w;
        }
       int result=sum*first;
        System.out.println(result);

    }

}
