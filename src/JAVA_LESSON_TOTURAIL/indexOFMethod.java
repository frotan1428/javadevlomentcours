package JAVA_LESSON_TOTURAIL;

import java.util.Scanner;

public class indexOFMethod {
    public static void main(String[] args) {

        System.out.println("Please Enter Any String");
        Scanner scan=new Scanner(System.in);
        String st=scan.nextLine();
        String initialOfFirst=st.substring(0,1);
        System.out.println(initialOfFirst);
        int indexOfInitialOfLastName = st.indexOf(" ") +1;
        String indexOfFirstNamelastName=st.substring(indexOfInitialOfLastName,indexOfInitialOfLastName+1);
        System.out.println("First OF two Letter:"+initialOfFirst+indexOfFirstNamelastName);

    }
}
