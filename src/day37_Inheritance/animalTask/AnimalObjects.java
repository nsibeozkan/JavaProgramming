package day37_Inheritance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1=new Dog("Alex", "Husky", 'M',1,"Small","White");
        System.out.println(dog1);
        dog1.bark();


        Cat cat=new Cat("Love", "Siamese",'F',2,"Large","Black");
        cat.scratch();

        Parrot parrot=new Parrot("King","Macaw",'M', 3,"Small", "Blue");
        System.out.println(parrot);
        parrot.sing();




    }
}
