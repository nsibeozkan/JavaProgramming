package day26_CustomMethodPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
       int[]result=   reverse(arr);
        System.out.println(Arrays.toString(result));

    }
       //reversed the array,returns a new array//{1,2,3,4,5,
    public static int [] reverse(int [] array){ //5,4,3,2,1
        int [] result=new int[array.length];
        int j=0;
        for (int i = array.length-1; i >=0 ; i--) {
          result[j++]=array[i];
        }
        return result;
    }

    //reversed the array,returns a new array
    public static double [] reverse(double [] array){
        double [] result=new double[array.length];
        int j=0;
        for (int i = array.length-1; i >=0 ; i--) {
            result[j++]=array[i];
        }
        return result;
    }

    //reversed the array,returns a new array
    public static char [] reverse(char [] array){
        char [] result=new char[array.length];
         int j=0;
        for (int i = array.length-1; i >=0 ; i--) {
            result[j++]=array[i];
        }
        return result;
    }

    //reversed the array,returns a new array
    public static String [] reverse(String [] array){
        String [] result=new String[array.length];
          int j=0;
        for (int i = array.length-1; i >=0 ; i--) {
            result[j++]=array[i];
        }
        return result;
    }



}
