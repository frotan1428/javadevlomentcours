package JAVA_LESSON_TOTURAIL.Constructors;

public class Student {

        String name;
         int age;
        String phone;

    public static void main(String[] args) {
        Student s1=new Student("Mohammad",25);
        Student s2=new Student("Johm",25,"0786574123");
        System.out.println(s2.name+","+s2.age+","+s2.phone);
        System.out.println(s1.name+"-"+s2.age);

    }

    Student(){

    }

   Student(String name,int age,String phone){
            this.phone=phone;
            this.name=name;
            this.age=age;
    }
    Student(String name,int age){

        this.name=name;
        this.age=age;
    }
}
