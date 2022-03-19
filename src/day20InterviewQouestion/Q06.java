package day20InterviewQouestion;

public class Q06 {

        //replace and concat two String .

    public static void main(String[] args) {

        String str="M ";
        str=str.concat("E ");
        String add="S ";
        str=str.concat(add);
        str.replace("S","T");
        str=str.concat(add);
        System.out.println(str);
    }


}
