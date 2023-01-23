package it.develhope.Exercise4;

public class Checks {
    public static void main(String args[]){
        Student Emmanuele = new Student();
        Student Daniela = new Student();
        Teacher Giulia = new Teacher();

        //Creazione insegnante
        Giulia.creationTeacher("Giulia");
        //Creazione studenti
        Emmanuele.creationStudent("Emmanuele");
        Daniela.creationStudent("Daniela");
        //Assegnazione voto
        Giulia.assignGrade(Emmanuele,7);
        Giulia.assignGrade(Daniela,9);
    }
}
