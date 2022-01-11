package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a =30 ;
        int b=7;
        int count=0;
        while(a>=b){
            a-=7;
            count++;
        }
        System.out.println(count+" with a remainder of "+ a);
    }
}
/*
write program that can divide two positive numbers without using/(division)and*(mul
30/7=4    a=30 b=7
a-=7
(a>=b)!!!!!onemli num num1e esit oluncaya kadar bolme yapacak num kucuk olursa islem devam etmeyecek.
 */