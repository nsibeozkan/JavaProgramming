package day10_NestedIf_Ternaries;

public class GradeReport {
    public static void main(String[] args) {
        int score = 75;
        if (score >= 0 && score <= 100) {
            if (score >= 90) {//false ; score<90
                System.out.println("Excellent");
            } else if (score >= 80 ) {// false : score <80
                System.out.println("Great");
            } else if (score >= 70 ) {//false :score <70
                System.out.println("Good");
            } else if (score >= 60 ) {//false ; score <60
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else {//if the score is Not Valid
            System.out.println("Invalid score");
        }

        System.out.println("=====================");

        String result ="";//temporary
        System.out.println(result);




        /* 90~100

         */










    }
}
