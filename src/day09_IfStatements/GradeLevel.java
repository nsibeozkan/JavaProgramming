package day09_IfStatements;

public class GradeLevel {

    public static void main(String[] args) {


                int grade = 6;//1-18

            boolean a = grade >= 1 && grade <= 5;//1-18

            boolean b = grade >= 6 &&  grade <=8;

            boolean c = grade >= 9 && grade <12;

            boolean d = grade >= 13 && grade <=16;

            boolean f = grade >= 17 && grade <= 18;


            if(a) {
                System.out.println("Elementary School");
            }
            if(b) {
                System.out.println("Middle School");
            }
            if(c) {
                System.out.println("High School");
            }
            if (d) {
                System.out.println("College");
            }
            if(f) {

                System.out.println("Grad School");
            }






        }


    }



