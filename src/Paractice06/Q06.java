package Paractice06;

public class Q06 {
    //Type a code that joins the given Strings
    //input => "Dear", "Ali", "Can", "we", "miss", "you"
    //output => "Dear Ali Can we miss you"

    public static void main(String[] args) {

        join("Dear","Ali","Can","we","miss","you");

    }

    public  static void  join(String...s){
        String result="";
        for (String each:s){
            result=result+each+" ";
        }
        System.out.println(result);
    }
}
