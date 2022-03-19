package day09forloopWhileLoop;

public class forLoop01 {
    public static void main(String[] args) {

        ////1.Example: Type code to print 5 times "Hello!" on the console
        //1way :not recommended a)reputation
        System.out.println("hello!");
        System.out.println("hello!");
        System.out.println("hello!");
        System.out.println("hello!");
        System.out.println("hello!");

        String st="Hello!";
        for (int i=0;i<5;i++){
            System.out.println(st);
        }
        System.out.println("=================");
       //2: Type all integers from 11 to 44 in the same line with a space between consecutive integers
        for (int i=11;i<45;i++){
            System.out.print(i + " ");
        }
        System.out.println("=================");
       //3.Example: Type even integers from 11 to 44 in the same line with a space between consecutive integers

        for (int i=11;i<45;i+=1){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("=================");
        //4.Example: Type odd integers from 68 to 13 in the same line with a space between consecutive integers
        // if stared value is greater than condition decrease
        // if stared value is less than condition increase
        for (int i=68;i>12;i-=1){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println("=============");
        //5.Example: Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space between consecutive integers

        for (int i=120; i>11;i-=1){
            if (i%4==0 && i%6==0){
                System.out.println(i+ " ");
            }
        }


    }
}
