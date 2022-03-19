package JAVA_LESSON_TOTURAIL.Constructors;

public class Students {
    String name="Emily";
    int age =20;

    public static void main(String[] args) {
        Students st=new Students("Oliver",11);
        System.out.print(st.name);
        System.out.println(","+st.age);

    }

    public Students(String name,int age){
        this.name=name;
        this.age=age;

    }
}
