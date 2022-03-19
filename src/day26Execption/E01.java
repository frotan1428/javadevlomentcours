package day26Execption;

public class E01 {


    /*

     1. Exception means un-expected issue in your codes.Like" Gas finished in your vocation
     2. There are 2 ways to work with exception .
        a)Exception handling  :Try-catch Block
        b)Throw Exception :technical massage
     */


    public static void main(String[] args) {

        Divided(12,12);//1
        Divided(0,1);//0
        Divided(12,0); // No Answer In Math
    }
    /*
// Note Following code is not recommended because it needs deep math knowledge
    public static void Divide(int a,int b){
        if (b==0){
            System.out.println("Divisor can not be Zero");
        }else{
            System.out.println(a/b);
        }

    }

    1. if you think any problem can occur for any line of code put it inside the try block than create a catch block
    2. Inside the catch-block parentheses put the possible exception class.
    3. By using e.getMassage  you can get technical massage
    4. If you want You can Put a non-technical massage inside the catch body
    5. If the code inside the try-body works without any issue catch-block  will not execute.
    6. After any exception occurred next line of codes can not be executed. JAVA STOPS EXECUTION****
    */

    public static void Divided(int a,int b){

        try {
            System.out.println(a/b);
            System.out.println("HI");
        }catch (ArithmeticException e){
            System.out.println("Could not Divided==>"+ e.getMessage());
        }

    }




}
