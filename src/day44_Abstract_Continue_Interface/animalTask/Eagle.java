package day44_Abstract_Continue_Interface.animalTask;

import java.sql.SQLOutput;

public final class Eagle extends Animal implements WildAnimal,Flyable{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating baklava");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " hunts snake");
    }
    public void fly(){
        System.out.println(getName() + " can fly 50km/h");
    }
}
