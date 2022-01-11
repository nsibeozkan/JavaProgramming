package day04_Variables;

public class Circle { //PI, radius,diameter, area,perimeter
    public static void main(String[] args) {
        double PI=3.14;
        double radius= 5.5;
        double diameter = radius * 2;//finds diameter by multiplying the radius to 2
        double area = PI * radius* radius;//finds the area of the circle
        double perimeter = diameter * PI;//finds the perimeter of the circle

        System.out.println("radius = " + radius);;
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);







    }









}
/*
 Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * radius * PI
 */