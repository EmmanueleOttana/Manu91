package it.develhope.javaBase.encapsulation2;

public class Person {
    private String name;
    private String surname;
    private double height;
    private int age;

    public String printPerson() {
        return "Person{ " +
                "name = " + name +
                ", surname = " + surname +
                ", height = " + height +
                ", age = " + age +
                " }";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

}