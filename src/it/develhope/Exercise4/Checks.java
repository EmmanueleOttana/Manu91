package it.develhope.Exercise4;

public class Checks {
    public static Student Emmanuele = new Student();
    public static Student Daniela = new Student();
    public static Teacher Giulia = new Teacher();

    public static void main(String args[]){
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
