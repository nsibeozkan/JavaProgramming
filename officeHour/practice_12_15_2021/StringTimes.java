package practice_12_15_2021;

import java.util.Scanner;

public class StringTimes {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter any word");
        String word=input.nextLine();
        System.out.println("Enter any positive number");
        int num=input.nextInt();

        //int count=0;
       String sum="";
       // while(count<num){
        //    sum+=word;
         //   count++;
       // }
        for(int i=0;i<num;i++){
            sum+=word;
        }
        System.out.println(sum);



    }
}
