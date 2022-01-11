package day08_IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {
        int number = 5 ;//1~12

        boolean has28Days = number ==2; //for the month that has 28 days
        boolean has30Days = number == 4 || number==6 || number ==9 || number==1;//for the months that has 30 days
        boolean has31Days = !has28Days && !has30Days;// if the months does have 28 days and 30 days

        if (has28Days) {//if months  has 28 days
            System.out.println("28 days");
        }
     if (has30Days){//if months has 30 days
    System.out.println("30 days");

         }
      if(has31Days){// if months has 31 days
          System.out.println("31 days");

            }




    }

}




/*
Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */