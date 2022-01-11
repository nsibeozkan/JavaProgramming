package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -1247483648;//any user number will be greater than -12474
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number:");
          int num =   scan.nextInt();//1,2,3,4,5

          if(num>max){//if the user entered number is greater than current maximum number
              max =num;
          }

        }
        System.out.println("max = " + max);

        /*
        write a program that asks the user to enter a number for 5 times
        return the maximum number
         */
    }
}
