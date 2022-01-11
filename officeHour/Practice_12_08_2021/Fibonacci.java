package Practice_12_08_2021;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        /* Create a program that will give you the Fibonacci numbers up to the x value.
				           Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
			               Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc
				          Ex:
				             Input:
				               8
				             Output:
				               0, 1, 1, 2, 3, 5, 8, 13
				         */

            Scanner input=new Scanner(System.in);
            System.out.println("How many fibonacci number do you want to see?");
            int number=input.nextInt();
            int num1=0;
            int num2=1;
            int result=0;

            System.out.println(num1);
            System.out.println(num2);

            for(int i=2;i<number;i++){
                result=num1+num2; // 0+1=1
                System.out.println(result);
                num1=num2; //num1=1
                num2=result; //num2=1
            }

input.close();
        }

    }

