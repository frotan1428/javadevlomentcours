package day05ifeslestaements;

import java.util.Scanner;

public class ifElsestatemennt03 {
    public static void main(String[] args) {
        // ask tu User type the weather is good sunny|| rainy
        Scanner input= new Scanner(System.in);
        System.out.println("Tell us the Weather sunny or rainy:");
        String weather=input.next();
       //when we compare to String we used equals getData;
      /*
        if (weather.equalsIgnoreCase("Sunny")||weather.equalsIgnoreCase("rainy")){
            System.out.println("The weather is Nice:Sunny");
        }else{
            System.out.println("The weather is not Good:Rain");
        }

       */
        if (weather.equals("sunny")){
            System.out.println("The weather is Nice:Sunny:");
        }else{
            System.out.println("The weather is not Good:Rain");
        }

        //if Have more than 100 dollar i can buy a headphone.
        int isMoney=90;
        if (isMoney<110){
            System.out.println("You can buy a Headphone");
        }else{
            System.out.println("Try next Time to buy a headphone.");
        }
    }
}
