package practice_01_12_2022.accessModifier;

public class AccessModifier {

    public static void main(String[] args) {
        Person person=new Person();
        person.ID=123;
        person.name="PALINA";
        person.lastName="Ivankiu";
       //person.age=25;(we can not reach because it is private)


    }
}
