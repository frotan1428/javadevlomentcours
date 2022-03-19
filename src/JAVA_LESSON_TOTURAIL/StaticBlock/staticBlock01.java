package JAVA_LESSON_TOTURAIL.StaticBlock;

public class staticBlock01 {

     static  int year=12;
     static  double pi=3.14;

     public staticBlock01(){
         System.out.println("Constructor");
     }

     static {
         year=12;
         System.out.println(year);
     }

    static {
        pi=3.14;

        System.out.println(pi);
    }
    public static void main(String[] args) {
            double r=2;
            double area=pi*r*r;
        staticBlock01 obj=new staticBlock01();
        System.out.println(area);
    }


}
