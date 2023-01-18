package it.develhope.Exercise6;

public class Test {
    //Creazione forme
    static Shape shape = new Shape();
    static Shape circle = new Shape(7.3);
    static Shape square = new Shape(4,10);
    static Shape rectangle = new Shape(4,2.5,5.2);
    static Shape triangle = new Shape(3,1.6,4.2,3.7);
    //Assegnazione forme
    static String detailsShape = shape.getShapeDetails();
    static String detailsCircle = circle.getShapeDetails();
    static String detailsSquare = square.getShapeDetails();
    static String detailsRectangle = rectangle.getShapeDetails();
    static String detailsTriangle = triangle.getShapeDetails();

    public static void main(String[] args) {
        //Stampa dettagli forme
        System.out.println(detailsShape);
        System.out.println(detailsCircle);
        System.out.println(detailsSquare);
        System.out.println(detailsRectangle);
        System.out.println(detailsTriangle);
    }
}