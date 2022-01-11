package day10_NestedIf_Ternaries;

public class NameOfMonth2 {
    public static void main(String[] args) {

       /* int number = 4;
        String result ="";
        if (number >=1 && number <=12){//if number is valid (1~12)
            if (number ==1 ){
                result = "January";
            }else if (number ==2){
                result = "February";
            }else if (number ==3){
                result = "March";
            }else if (number ==4){
                result = "April";
            }else if (number ==5){
                result = "May";
            }else if (number ==6){
                result = "June";
            }else if (number ==7){
                result = "July";
            }else if (number ==8){
                result = "August";
            }else if (number ==9){
                result = "September";
            }else if (number ==10){
                result = "October";
            }else if (number ==11){
                result = "November";
            }else if (number ==12){
                result="September";
            }
        }else {//if the number is not valid
            result = "Invalid";

        }
        System.out.println(result); */

        int n = 5;
        String name =(n==1)? "Jan":(n==2)? "Feb":(n==3)? "March": (n==4)? "April":(n==5)? "May":
                (n==6)? "Jun":(n==7)? "July":(n==8)? "Aug":(n==9)? "Sep":(n==10)? "Oct":
                        (n==11)?"Nov":"Sep";
        System.out.println(name);

    }




}
