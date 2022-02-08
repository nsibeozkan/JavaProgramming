package day45_Abstraction_Continue.shapeTask;

public class Square extends Shape {

    private double side;

    public Square(String name, double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            throw new RuntimeException("Invalid side "+side);
        }
        this.side = side;
    }


    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side ;
    }

    @Override
    public String toString() {
        return "Square{" +
                this.toString()+
                "side=" + side +
                '}';
    }





}
