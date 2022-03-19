package JAVA_LESSON_TOTURAIL;

public class StringBuilder02 {

    public static void main(String[] args) {



        // Hafsa I love You forever.
        join("Hafsa","I","Love","You","forever");

    }

    public static void join(String...s){
       String result="";
        for (String st:s){
            result=result+st+" ";

        }
        System.out.println(result);



    }
}
