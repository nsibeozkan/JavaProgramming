package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Test started");


        try {
            System.out.println(9 / 0);

            System.out.println("Try Block");

        } catch(RuntimeException e){

            System.out.println("Catch block");

            System.out.println("Arithmetic Exception is was occurred");
            }

        System.out.println("Test Completed");

        System.out.println("=====================");



        System.out.println("Test2 started");

        int [] numbers={1,2,3,4,5};
        try {
            System.out.println(numbers[200]);
        }catch(RuntimeException e){
          // e.printStackTrace();//exception detayli bilgisini veriyor
            System.out.println( e.getMessage());// exception nedenini yaziyor
        }



        System.out.println("Test2 Completed");


        System.out.println("------------------------------");

        System.out.println("Test3 started");

        try {

            System.out.println("Cydeo".substring(2, 0));
        }catch(RuntimeException e){
         // e.printStackTrace();
        }



        System.out.println("-------------------------");


        System.out.println("Hello World");

    try {
        Thread.sleep(3000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }

        System.out.println("Cydeo");

        System.out.println(" -----------------------------");

        try {
            FileInputStream file=new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }







    }


