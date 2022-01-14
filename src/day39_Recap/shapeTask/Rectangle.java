package day39_Recap.shapeTask;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.err.println("Invalid width");
            System.exit(1);
        }

        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0){
            System.out.println("Invalid length");
            System.exit(1);
        }
        this.length = length;
    }


    public Rectangle( double width, double length) {
        super("Rectangle");
       setWidth(width);
       setLength(length);
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +'\''+
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter()+ '\'' +
                '}';
    }
}
