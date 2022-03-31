package Lamda_Funcational_prgraming;

import java.util.List;

public class Utils {

    public static void printInSameLineWithSpace(Object o){
        System.out.print( o+ " ");

        //Utils::printInSameLineWithSpace
    }
    public static boolean CheckToBeEven(int x){
        return  x%2==0;
      //  Utils::CheckToBeEven
    }
        public static boolean getMoreThanEight(int x){
        return x>8;
        }

    public static boolean CheckToBeOdd(int x){
        return  x%2!=0;
        //  Utils::CheckToBeOdd
    }

    public static int getSquare(int x){
        return x*x;
        //Utils::getSquare
    }

    public static void printElementWithStar(Object o){
        System.out.println(o+ " *");
        //Utils::printElementWithStar

    }

    public static int getCube(int x){
        return x*x*x;
        //Utils::getCube
    }

    public static double getHalfOfElements(double x){
        return x/2.0;
    }

    public static char getLastChar(String str){
       return str.charAt(str.length()-1);
    }

}
