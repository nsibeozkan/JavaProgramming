package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12" + 1);// 121 , concatenation

        System.out.println(10 + 20); // 20 addition
        System.out.println(100-50);// 50 subtraction
        System.out.println(100*20); //

        System.out.println(100/3);//33
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);//2.5
        System.out.println(10d/4);//2.5

        int a = 100;
        double b = a/6 ; //16.0
        System.out.println(b);
        double c = (double)a/6; // 16.666
        System.out.println(c);
        System.out.println(100D);




    }




}
/*
+ : addition
- : subtract
* : multiplication
/ : divison
% : remainder
integer/integer =====>integer
decimal / integer =====>decimal
integer / decimal =====> decimal
decimal / decimal =====> decimal


in math: 10/4 = 2.5

in java ; 10/4 = 2
10.0 / 4 = 2.5

 */

