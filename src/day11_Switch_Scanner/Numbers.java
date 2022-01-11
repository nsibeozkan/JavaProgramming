package day11_Switch_Scanner;

public class Numbers {
    public static void main(String[] args) {
        int num =12;
       String result= (num>=0&&num<=9)?(num==0)?"zero":(num==1)?"one":(num==2)?"two":(num==3)?"three":
                (num==4)?"four":(num==5)?"five":(num==6)?"six":(num==7)?"seven":(num==8)?"eight":
                "nine":"invalid";


        System.out.println(result);





    }
}
