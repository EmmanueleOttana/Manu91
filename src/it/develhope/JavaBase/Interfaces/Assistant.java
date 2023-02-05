package it.develhope.JavaBase.Interfaces;

public class Assistant extends CollegePerson implements TeachingPerson, LearningPerson{
    boolean isGoingToBeAPhD;
    @Override
    public void studyAtHome() {
        System.out.println("Assistant "+this.surname+" "+this.name+" assigns topic: The atomic");
    }
    @Override
    public void teachToOtherPeople() { System.out.println("Assistant "+this.surname+" "+this.name+
            " is studying the topic: The approach to the student");
    }
    public Assistant(String name, String  surname, int id, boolean willBeAPhD){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhD = willBeAPhD;
    }
}
