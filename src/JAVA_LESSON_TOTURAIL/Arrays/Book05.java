package JAVA_LESSON_TOTURAIL.Arrays;

public class Book05 {

    public static void main(String[] args) {

        int myArray[]={12,13,14};
        for (int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
        System.out.println("======= 2nd way==========");
        //or
        for (int w:myArray){
            System.out.println(w);
        }

    }
}
