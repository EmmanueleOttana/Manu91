package it.develhope.Exercise5;

public class Student extends CollegePerson implements LearningPerson{

    int academicYear;
    @Override
    public void studyAtHome() {
        System.out.println("Student "+this.surname+" "+this.name+" is studying the topic: Molecule");
    }
    public void infoStudent(String name, String  surname, int id, int year){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.academicYear = year;
    }

}