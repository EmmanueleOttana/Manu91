package it.develhope.Exercise5;

public class Test {
    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        Professor professor = new Professor();
        Student student = new Student();

        //Assegnazione info personali
        assistant.infoAssistant("Edwin","Jarvis",37,true);
        professor.infoProfessor("Tony","Stark",10,"scientist");
        student.infoStudent("Peter","Parker",73,5);
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
