package day12_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
         int age = input.nextInt();

         input.nextLine();

        System.out.println("Enter your full name:");
        String name=input.nextLine();

        System.out.println("Enter your GPA:");
        double gpa = input.nextDouble();//3.5

        input.nextLine();

        System.out.println("Enter your school name:");
        String schoolName   =input.nextLine();




        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);


input.close();

    }
}
/*
1.ask user to enter age(next.int ()
2. ask the user to enter full name(nextLine())
 */