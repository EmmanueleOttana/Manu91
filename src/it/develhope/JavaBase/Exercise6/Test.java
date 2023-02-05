package it.develhope.JavaBase.Exercise6;

public class Test {
    public static void main(String[] args) {
        //Creazione forme
        Shape shape = new Shape();
        Shape circle = new Shape(7.3);
        Shape square = new Shape(4,10);
        Shape rectangle = new Shape(4,2.5,5.2);
        Shape triangle = new Shape(3,1.6,4.2,3.7);
        //Assegnazione forme
        System.out.println(shape.getShapeDetails());
        System.out.println(circle.getShapeDetails());
        System.out.println(square.getShapeDetails());
        System.out.println(rectangle.getShapeDetails());
        System.out.println(triangle.getShapeDetails());
    }
}