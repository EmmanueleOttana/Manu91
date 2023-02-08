package it.develhope.javaBase.constructor2;

public class Student {
    public String name;
    public int grade;

    public void creationStudent(String studentName){
        this.name = studentName;
        System.out.println(studentName +" object was created");
    }
    public void getStudentDetails(){
        System.out.println("The grade of "+ this.name+" is "+this.grade);
    }
}
