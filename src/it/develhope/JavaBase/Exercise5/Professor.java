package it.develhope.JavaBase.Exercise5;

public class Professor extends CollegePerson implements TeachingPerson {

    String teachingSubject;
    @Override
    public void teachToOtherPeople() {
        System.out.println("Professor "+this.surname+" "+this.name+" assigns topic: Molecule");
    }
    public Professor(String name, String surname, int id, String subject){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = subject;
    }
}
