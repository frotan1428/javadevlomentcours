package day05ifeslestaements;

import java.util.Scanner;

public class AgesandStages {
    public static void main(String[] args) {

        //0 - 4 => baby
        //4 - 12 => child
        //12 - 20 => teenager
        //20 - 30 => adult
        //else (not expected age)


        Scanner scan =new Scanner(System.in);
        System.out.println("Please Enter a age:");
        int age=scan.nextInt();
        if (age >=0 && age <=4){
            System.out.println("this is a Baby");
        }else if(age >=5 && age <=12){
            System.out.println("this is a child");
        }else if(age >=13 && age <=20){
            System.out.println("this is a teanger");
        }else if(age >=21 && age <=30){
            System.out.println("this is an adult");
        }else{
            System.out.println("not expected age");
        }


    }
}
