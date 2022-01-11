package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int min = 1247483647;//any user number will be less than 2147483647
        for (int i = 10; i <15 ; i++) {
            System.out.println("Enter a number:");
            int num =   scan.nextInt();//1,2,3,4,5

            if(num<min){//if the user entered number is greater than current maximum number
                min =num;
            }

        }
        System.out.println("min = " + min);




        /*
         write a program that asks the user to enter a number for 5 times
        return the minimum number
         */
    }
}
