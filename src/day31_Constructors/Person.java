package day31_Constructors;

public class Person {
    //instance variable
    public String name;
    public char gender;
    public int age;

     //constructor
    public Person(String name,char gender,int age){
     this.name=name;
     this.gender=gender;
     this.age=age;
    }



   //toString
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }








}
