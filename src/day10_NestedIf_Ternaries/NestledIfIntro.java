package day10_NestedIf_Ternaries;

public class NestledIfIntro {
    public static void main(String[] args) {
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


        System.out.println("================================");

      int age = 18;
      boolean hasId = true;
      if (hasId) {//IF the person have ID.
          if (age >= 21) {//if teh person is 21 years and older
              System.out.println("Eligible to buy alcohol");
          } else {//if the person is less than 21 years old
              System.out.println(" Not Eligible to buy alcohol");
          }
      }else {//if the person does not have ID
          System.out.println("you must have ID to buy alcohol.");
      }

        System.out.println("======================");

      int number = 8;
       if (number>=1 && number <=7){//1~7
           if (number==1){
               System.out.println("Monday");

           }else if(number ==2){
               System.out.println("Tuesday");

           }else if(number ==3){
               System.out.println("Wednesday");

           }else if(number ==4){
               System.out.println("Thursday");

           }else if(number ==5){
               System.out.println("Friday");

           }else if(number ==6){
               System.out.println("Saturday");
           }else if (number == 7){
               System.out.println("Sunday");
           }

       }else  {
           System.out.println("Invalid Number");
       }











    }
}
