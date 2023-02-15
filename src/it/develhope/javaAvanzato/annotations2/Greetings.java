package it.develhope.javaAvanzato.annotations2;


import java.text.Annotation;

public class Greetings {

    @myAnnotation(DevName = "John",DevSurname = "Walker")
    void sayWelcome(){
        System.out.println("Welcome");
    }

    @myAnnotation(DevName = "Mark",DevSurname = "Brown")
    void sayGoodbye(){
        System.out.println("Goodbye");
    }
}