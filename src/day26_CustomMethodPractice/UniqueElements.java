package day26_CustomMethodPractice;

import day36_Inheritance.utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int [] array={1,2,3,3,4,4,5,6,6,7,7,7};
        int[] unique=uniqueElements(array);
        System.out.println(Arrays.toString(unique));

        double[] array2={1.2,3.4,5.7,5.7,4.5,4.5,};
        double[] unique2=uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));


        

        }



//returns the unique elements of the array as a new array
        public static int[] uniqueElements(int[]array){
        int[] result={};
        for(int each:array){
            if(ArraysUtility.frequencyOfElement(array,each)==1){//if the frequency is 1,the element is unique
           result =ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[]array){
        double[] result={};
        for(double each:array){
            if(ArraysUtility.frequencyOfElement(array,each)==1){//if the frequency is 1,the element is unique
                result =ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[]array){
        char[] result={};
        for(char each:array){
            if(ArraysUtility.frequencyOfElement(array,each)==1){//if the frequency is 1,the element is unique
                result =ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[]array){
        String[] result={};
        for(String each:array){
            if(ArraysUtility.frequencyOfElement(array,each)==1){//if the frequency is 1,the element is unique
                result =ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }




}




