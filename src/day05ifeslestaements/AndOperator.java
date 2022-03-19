package day05ifeslestaements;

public class AndOperator {
    //If I have money, I can buy something

    //If I have car, I can go shopping

    //Can I go to shopping center and buy something?

    //true and true  => true

    //false and true => false

    //true and false => false

    //false and false =>
    public static void main(String[] args) {

    boolean money=false;
    boolean transport=true;

    if (money  && transport){
        System.out.println("I Can go Market and Shopping ");
    }else{
        System.out.println("Sorry you Can not go Market and Shopping ");
    }

    }
}
