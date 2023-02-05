package it.develhope.JavaAvanzato.Wildcards2;

public class Test {
    public static void main(String[] args) {
        GenericsClass <Integer> firstElement = new GenericsClass<>();
        GenericsClass <Integer> secondElement = new GenericsClass<>();
        GenericsClass <String> thirdElement = new GenericsClass <>();
        GenericsClass <String> fourthElement = new GenericsClass<>();

        firstElement.setT(12);
        secondElement.setT(13);
        thirdElement.setT("This is a string");
        fourthElement.setT("This is a string");

        System.out.println("First element is equal to second element? "+GenericsClass.isEquals(firstElement,secondElement));
        System.out.println("Third element is equal to fourth element? "+GenericsClass.isEquals(thirdElement,fourthElement));

    }
}