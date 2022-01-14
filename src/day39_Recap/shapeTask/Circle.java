package day39_Recap.shapeTask;

public class Circle extends Shape {//onemli extends yapmadan once instancelari yaz get ve set yap sonra extends yap
    private double radius;
    public static double pi=3.14;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.out.println("Invalid radius "+radius);
            System.exit(1);
        }
        this.radius = radius;
    }
//constructor
    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }


    @Override
    public double area() {
        return pi*radius*radius;

    }

    @Override
    public double perimeter() {
       return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +'\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter()+ '\'' +
                '}';
    }


}
