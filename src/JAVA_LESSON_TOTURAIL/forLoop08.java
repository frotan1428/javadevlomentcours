package JAVA_LESSON_TOTURAIL;

public class forLoop08 {
    public static void main(String[] args) {

        //3.Example :Type code to print a String in inverse after removing space for example: "Ali Can"==>"naCilA"
        String st="Hafasa";
        String noSpace=st.replace(" ","");
        for (int i=noSpace.length()-1;i>-1; i-=1){

            System.out.print(noSpace.charAt(i));
        }
    }
}
