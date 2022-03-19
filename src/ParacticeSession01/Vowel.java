package ParacticeSession01;

import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {
        //Take character input from the user and check whether the character is vowel or not. Also check if user is not
        // entering the character then print the error that it is not a character
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Any Character");
        String input = scan.next().toLowerCase();
        // check the uppercase  and lowercase Vowel
        boolean uppercase=input.charAt(0)>=65 && input.charAt(0)<=90;
        boolean lowercase=input.charAt(0)>=97 && input.charAt(0)<=122;
        boolean vowel=input.equals("a")||input.equals("e")||
                       input.equals("i")||input.equals("o")||input.equals("u");
        // Check  if the user Enter a single Character :not more than one Character
        if (input.length()>1){
            System.out.println("Error, Please Enter A single Character");
        }else if (!(lowercase)){
            System.out.println("Please Enter only alphabets");
        }else if (vowel){
            System.out.println(" You Enter Vowels Character");
        }else{
            System.out.println("You did Not Enter a vowel Character");
        }







    }

}
