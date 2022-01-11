package day20_Arrays;

import java.util.Arrays;

public class ArrayNumber {

    public static void main(String[] args) {
        int [] numbers= new int[100];
        int num =1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=num++;
        }
        System.out.println(Arrays.toString(numbers));


        System.out.println("=================================");
        int []numbers2=new int [100];
        int num1=100;
        for (int j=numbers2.length; j >0 ; j--) {
            numbers2[j] -=num1;
        }
        System.out.println(Arrays.toString(numbers2));
    }
}
