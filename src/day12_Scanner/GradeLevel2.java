package day12_Scanner;

public class GradeLevel2 {
    public static void main(String[] args) {
        int number = 4;

        String result = "";


        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                result = "Elementary school";

            case 6:
            case 7:
            case 8:
                result = "Middle school";
                break;

            case 9:
            case 10:
            case 11:
            case 12:
                result = "High school";
                break;

            case 13:
            case 14:
            case 15:
            case 16:
                result = "College";
                break;

            case 17:
            case 18:
                result = "Grad School";
                break;

            default: // 1~5
                result = "Invalid Grade Level";
        }


         /*
         if(number>= 1 && number <= 18){  // 1 ~ 18

             switch (number){ // 1 ~ 18:  case: 6~18,  default: 1~5
 @@ -33,6 +59,8 @@ public static void main(String[] args) {
         }else{
            result = "Invalid Grade Level";
         }
 */


        System.out.println(result);
    }
}

