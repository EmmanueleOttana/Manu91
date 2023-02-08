package it.develhope.javaBase.classesAndObjects2;

public class Programmer {
    public String name;
    public String programmingLanguage;
    public int yearsOfExperience;

    public String printProgrammerDetails(){
        return "The programmer's name is "+ this.name +
                " he is a type programmer "+ this.programmingLanguage +
                " and as "+ this.yearsOfExperience + " years experience";
    }
}
