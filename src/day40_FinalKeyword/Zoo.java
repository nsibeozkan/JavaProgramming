package day40_FinalKeyword;

public class Zoo {
    public static void main(String[] args) {
        Dog dog1=new Dog("Max","Husky",'M',"white","small",1);
        System.out.println(dog1.getAge());
        System.out.println(dog1.getGender());
        dog1.drink();
    }
}
