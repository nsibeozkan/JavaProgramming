package day10_NestedIf_Ternaries;

public class TernariesWithNestedIf {

    public static void main(String[] args) {
        int s = 85;
       /* if (s>=0&& s <=100){
            if (s>=60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid Score");
        }*/
       String result = (s >= 0 && s <= 100 )? (s >=60)?"Passed":"Failed":"Invalid Score";
        System.out.println(result);







    }
} /*
 int score =120;
        if (score>=0 && score<=100) {//if the score is valid

            if (score >= 60) {//if student passed the exam
                System.out.println("Passed");
            } else {// if student failed exam
                System.out.println("Failed");
            }
        }else {// if the score is not valid
            System.out.println("Invalid");

        }
*/
