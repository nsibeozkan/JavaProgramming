package day40_FinalKeyword;

public final class Dog extends Animal {

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }
    //Dog dog=new Dog("Van"

    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }
    // public void drink(){//final method can not be overriding

    public void bark(){
        System.out.println(getName()+ " is barking");
    }



}








