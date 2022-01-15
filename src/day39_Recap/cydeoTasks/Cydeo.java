package day39_Recap.cydeoTasks;

public class Cydeo {
    public static void main(String[] args) {


        Developer developer = new Developer("Korkmaz", 23, 'F', 12, "Java Developer", 120000);

        Tester tester = new Tester("Olga", 23, 'F', 23, "SDET", 110000);

        Teacher teacher = new Teacher("Daniela", 45, 'M', 34, "Math Teacher", 124000);

        Student student = new Student("Okan", 30, 'M', 45, "SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);


        System.out.println("=========================");


        developer.setName("nesibe");
        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);

        developer.work();
        tester.work();
        teacher.work();
        System.out.println("========================");
        developer.drink();
        developer.eat();
        developer.sleep();

        System.out.println("======================");
         teacher.work();
         tester.createTicket();
        System.out.println("===============");

        student.eat();
        student.drink();
        student.sleep();
        student.study();













    }


}
