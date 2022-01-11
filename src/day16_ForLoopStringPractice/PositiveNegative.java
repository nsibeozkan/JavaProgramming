package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int positiveCount= 0;
        int negativeCount =0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter  number");
            int num= scan.nextInt();
            if (num>=0){
                positiveCount++;
            }else{
                negativeCount++;
            }

        }
        System.out.println( positiveCount + " positive and "+negativeCount + " negative" );
scan.close();


       /* Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
        Ex:
        Inputs:
        10
        20
        -1
        0
        3

        Output:
        3 positive and 1 negative*/
    }
}
