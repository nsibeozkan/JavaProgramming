package day39_Recap.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
      Square square=new Square(10);
        System.out.println(square);
        System.out.println(square.getName());

        square.setSide(20);
        System.out.println(square);
        System.out.println("------------------------");


        Rectangle rectangle=new Rectangle(10,8);
        System.out.println(rectangle);
       rectangle.setLength(10);
        System.out.println(rectangle.getLength());

        System.out.println(rectangle);
        System.out.println(rectangle.getName());
        System.out.println("===================");

        Circle circle=new Circle(12);
        System.out.println(circle);

        circle.setRadius(20);
        System.out.println(circle);
        System.out.println(circle.getRadius());
        System.out.println(circle.getName());



    }





}
