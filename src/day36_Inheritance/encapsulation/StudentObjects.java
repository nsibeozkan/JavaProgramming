package day36_Inheritance.encapsulation;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1=new Student("nesibe",35,'F','A',"Cydeo School");
        System.out.println(student1);
        student1.setName("Burcu Neda");
        System.out.println(student1);


    }
}
