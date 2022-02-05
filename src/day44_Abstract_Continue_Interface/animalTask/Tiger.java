package day44_Abstract_Continue_Interface.animalTask;

public  final class Tiger extends Animal{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating meat");
    }


    public void hunt(){
        System.out.println(getName()+ " is hunting");
    }
}
