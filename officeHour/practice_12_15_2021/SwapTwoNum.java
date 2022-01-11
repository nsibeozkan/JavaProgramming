package practice_12_15_2021;
  import java.util.Scanner;
public class SwapTwoNum {
    public static void main(String[] args) {
        int a=10;
        int b=15;

    //a=15,b=10;
        int temp=a;
         a=b;
         b=temp;
        System.out.println(a);
        System.out.println(b);


        Scanner input=new Scanner(System.in);
        System.out.println("How many fibonacci number do you want to see?");
        int number=input.nextInt();
        int num0=0;
        int num1=1;
        int result=0;

        System.out.println(num0);
        System.out.println(num1);

        for(int i=2;i<number;i++){
            result=num0+num1; // 0+1=1
            System.out.println(result);
            num0=num1; //num1=1
            num1=result; //num2=1
        }


    }
}
