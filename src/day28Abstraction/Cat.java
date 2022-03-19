package day28Abstraction;

public  class Cat extends Animal{


    String sound;
    String name;
    public Cat(String sound,String name) {
        this.sound=sound;
        this.name=name;

    }

    @Override
    public void animalSound() {

        System.out.println("animals sound is:"+sound);
    }

    @Override
    public void animalName() {
        System.out.println("animals Name is:"+sound);
    }
}
