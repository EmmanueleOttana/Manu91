package it.develhope.javaBase.overload;

public class Shape {
    public String shapeName;
    public int numberOfEdges;

    public Shape(){
        System.out.println("The shape object has been created");
        this.shapeName = "Undefined";
    }
    public Shape(double radius){
        System.out.println("The circle object has been created");
        this.shapeName = "Circle";
    }
    public Shape(int edges, double edgeLength){
        System.out.println("The square object has been created");
        this.shapeName = "Square";
        this.numberOfEdges = edges;
    }
    public Shape(int edge, double e1, double e2){
        System.out.println("The rectangle object has been created");
        this.shapeName = "Rectangle";
        this.numberOfEdges = edge;
    }
    public Shape(int edge, double e1, double e2, double e3){
        System.out.println("The triangle object has been created");
        this.shapeName = "Triangle";
        this.numberOfEdges = edge;
    }
    public String getShapeDetails(){

        return "Shape name: "+shapeName+" number of edges: "+numberOfEdges;
    }
}
