package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

            int n1 = 100,
                n2 = 200;

        boolean maxNumber1 = n1 > n2;
        if (maxNumber1){
            System.out.println(n1 + " is the maximum number");
        }
        boolean maxNumber2 = n2 > n1;
        if (maxNumber2){
            System.out.println(n2 + " is the maximum number");
        }
        boolean equal = n1 == n2;
        if (equal){
            System.out.println("Equal");
        }

    }
}








/*
Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number
 */