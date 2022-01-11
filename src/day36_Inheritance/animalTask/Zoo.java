package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',2 ,"Small","White");
        System.out.println(dog);
        dog.sleep();
        dog.eat();
        dog.drink();
        dog.move();
        dog.bark();

         Cat cat = new Cat();
         cat.setInfo("Tarcin","British",'M',3,"Small","brown");
         System.out.println(cat);
         cat.drink();
         cat.eat();
         cat.move();
         cat.scratch();
         cat.meow();
         //cat.bark(); it is for tiger

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',4,"Large","Red");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.hunt();
         tiger.roar();
     //tiger.meow(); it is for cat
        System.out.println(tiger);
    }



}
