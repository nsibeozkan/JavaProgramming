package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {
       int a = 10;
       int b= 15;
       //-----------------a
       int c= a;//10
        a=b;
        b=c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
/*
 write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10

 */