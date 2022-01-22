package day34_GarbageCollection_AccessModifiers;
import static day34_GarbageCollection_AccessModifiers.Circle.*;

import static day36_Inheritance.utilities.MathUtility.*;

public class Test {


        public static void main(String[] args) {

            System.out.println(pi);
            System.out.println(name);
            System.out.println(numbers);

            System.out.println("----------------------------");
            //find the sum of 10,20

           int r1= sum(10,20);
            System.out.println(r1);


            //find the sum of 100 ,200

            int r2= sum(100,200);
            System.out.println(r2);


            int r3=subtract(100,50);
            int r4=max(1000,2000);
            System.out.println("r3 = " + r3);
            System.out.println(r4);
        }












}
