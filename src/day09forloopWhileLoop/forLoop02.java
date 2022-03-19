package day09forloopWhileLoop;

public class forLoop02 {
    public static void main(String[] args) {


        //1.example: put * between to consecutive Character in String fro example:java====>j*a*v*a*
        // if you work with String you must start with index;

        String s="java";
        for (int i=0;i<s.length();i+=1){
            System.out.print(s.charAt(i)+"*");
        }
        //2.Example Find the Unique from String;
        String t="Hello";//Heo
        for (int i=0;i<t.length();i+=1){
            if (t.indexOf(t.charAt(i))==t.lastIndexOf(t.charAt(i))){
                System.out.println(t.charAt(i));
            }
        }
        //3.Example :Type code to print a String in inverse after removing space for example: "Ali Can"==>"naCilA"

        String u="Ali Can";
        String noSpace = u.replace(" ","");
        for (int i=noSpace.length()-1;i>-1;i-=1){
            System.out.print(noSpace.charAt(i));
        }

    }
}
