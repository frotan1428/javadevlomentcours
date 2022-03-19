package JAVA_LESSON_TOTURAIL;

public class forLoop07 {
    public static void main(String[] args) {

        //2.Example Find the Unique from String;
        String st="Love";//love

        for (int i=0;i<st.length();i+=1){

            if(st.indexOf(st.charAt(i))==st.lastIndexOf(st.charAt(i))){

                System.out.print(st.charAt(i));
            }


        }


    }
}
