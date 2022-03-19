package JAVA_LESSON_TOTURAIL;

public class operationInJava {
    public static void main(String[] args) {



        //1.exam[le:
      //  int x=38 / 2 - ( 4 + 3) * 2 ;
        int x2=8 + 2 * ( 14 - 6 / 2) - 12;
        System.out.println(x2);

    //Write a program to assign a value of 100.235 to a double variable
        //and then convert it to int. Print it on the console.
        double d=100.325;
        int i=(int)d;
        System.out.println(i);
    //Write a program to add an integer variable having value 5
        //and a double variable having value 6.2. Print the sum on the console.

        int a=5;
        double b=6.2;
        double sum=a+b;
        System.out.println(sum);

        //Create an integer variable and increase it by 1, by using three different ways,
        //then type every result on the console.
        int var=2;
        System.out.println(var=var+1);
        System.out.println(var+=1);
        System.out.println(var++);
        //Create an integer variable and decrease it by 1, by using three different ways,
        //then type every result on the console.

        System.out.println(var=var-1);
        System.out.println(var-=1);
        System.out.println(var--);

    }
}
