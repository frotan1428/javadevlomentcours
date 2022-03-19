package day26Execption;

/*
 convert String to integer
 1 Integer valueOf(); gives you Integer wrapper Class
 IntegrparseInt(); Give you int primitive
 */

public class E04 {

    public static void main(String[] args) {

        CovertStringToInteger("123");

        String st="1234";
        CovertStringToInteger(st);

        String s="123e";
        CovertStringToInteger(s);//NumberFormatException==> For input string: "123e"
    }

    public static void CovertStringToInteger(String str){
       try {
           System.out.println(Integer.parseInt(str)+1);
       }catch (NumberFormatException e){
           System.err.println("String Couldn't be Convert to an Int==>" +e.getMessage());
       }
    }


}
