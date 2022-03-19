package JAVA_LESSON_TOTURAIL;

public class Person {


    String name;
    String lastname;


    public Person(String name,String lastname){
        this.name=name;
        this.lastname=lastname;

    }
    public static void main(String[] args) {
        Person person=new Person("ali","khan");

        System.out.println(person.name);
        System.out.println(person.lastname);
        System.out.println(person.name+person.lastname+"@gmail.com");

    }

}

