package Paractice01;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

      /*
        Type the codes which asks the user to put the letters for the favorite football club in Turkey.
        It prints "Galatasaray" for gs,
                it prints "Trabzonspor" for ts,
                it prints "Besiktas" for bjk, and
        it prints "Fenerbahce" for fb.
                Please use switch statement in your codes.

       */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The fleeter Favorite Club");

        String club = scan.next().toLowerCase();
        switch(club){
            case "gs":

                System.out.println("Galatasaray");
                break;
            case "tz":
                System.out.println("Trabzonspor");
                break;
            case "fb":
                System.out.println("feberbahce");
                break;
            case "bjs":
                System.out.println("bisiktas");
                break;

            default:
                System.out.println("WE do not know the Club");

        }
    }
}
