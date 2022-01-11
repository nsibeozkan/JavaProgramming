package day26_CustomMethodPractice;

import utilities.ArraysUtility;

public class ReverseArray2 {
    public static void main(String[] args) {

        int [] arr1={1,2,3,4,5};


    }


    public static int[] reverse(int[]array){
        int[] result={};
        for(int i= array.length-1;i>=0;i--){
          result=  ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }



}
