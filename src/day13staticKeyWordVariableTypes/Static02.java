package day13staticKeyWordVariableTypes;

public class Static02 {

    public static void main(String[] args) {

        Static01 obj4=new Static01();
        System.out.println(Static01.sCounter);//To access a static no need to use object,Just using class name you can access it. both you can use but clas is better.
        System.out.println(obj4.iCounter);// To access instance Variable you have to use object name by class name it is impossible to access instance variable


    }



}
