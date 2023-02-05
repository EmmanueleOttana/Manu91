package it.develhope.JavaBase.Interfaces;

public class Test {
    public static void main(String[] args) {
        Assistant assistant = new Assistant("Edwin","Jarvis",37,true);
        Professor professor = new Professor("Tony","Stark",10,"scientist");
        Student student = new Student("Peter","Parker",73,5);

        //Stampa info personali
        assistant.goToCollege();
        professor.goToCollege();
        student.goToCollege();
        //Stampa azioni persone
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
        professor.teachToOtherPeople();
        student.studyAtHome();
    }
}
