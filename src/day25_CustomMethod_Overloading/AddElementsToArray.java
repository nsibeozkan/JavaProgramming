package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        int [] arr={1,2,3,4};
         arr=   addInteger(arr,5);
        System.out.println(Arrays.toString(arr));


        double [] arr2={1.5,2.5,3.5,4.5};
        arr2=  addDouble(arr2,5.5);
        System.out.println(Arrays.toString(arr2));

        String [] names={"Tatiana","Oleksandr","Cassandra","Ali"};
        names=addString(names,"Nesibe");
        System.out.println(Arrays.toString(names));

        char [] chars={'A','B','C','D'};
        chars=addChar(chars,'E');
        System.out.println(Arrays.toString(chars));

    }




    public static int [] addInteger(int[]array,int element){
        int[] result=new int[array.length+1];
        int i=0;
        for(int each:array){
            result[i++]=each;
        }
        result[i]=element;

        return result;
    }


    public static double[] addDouble(double[]array,double element){
        double [] result=new double[array.length+1];
        int i=0;
        for(double each: array){
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }


    public static String[] addString(String[]array,String element){
       String [] result=new String[array.length+1];
        int i=0;
        for(String each: array){
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }


    public static char[] addChar(char[]array,char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }



}





















/*
	1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add aString after last index of a char array
 */