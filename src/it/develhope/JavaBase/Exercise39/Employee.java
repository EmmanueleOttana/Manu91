package it.develhope.JavaBase.Exercise39;

public class Employee {
    String name;
    String surname;
    String address;

    public Employee(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getEmployeeDetails() {
        return "Employee{ " +
                "name= " + name +
                ", surname= " + surname +
                ", address= " + address +
                " }";
    }

}
