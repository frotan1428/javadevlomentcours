package ParacticeSession01;

import java.util.Scanner;

public class LoginSystem {
    /*
    Make a login System:
                There is a choice of entering username or Email
                And password is compulsory
                username: faizan123
                email: faizan@gmail.com
                password: admin123
     */

    public static void main(String[] args) {
        String user="Frotan1427";
        String email="Frotan14272@gamil.com";
        String pass="Frotan1427";

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Your username or  email: ");
        String username=scan.nextLine();
        System.out.println("Please Enter Your password: ");
        String password=scan.nextLine();

        if (username.equalsIgnoreCase(user)|| username.equalsIgnoreCase(email)&& password.equalsIgnoreCase(pass)){

            System.out.println("Welcome your logged In");
        }else{
            System.out.println("Sorry, wrong credentials");
        }




    }
}
