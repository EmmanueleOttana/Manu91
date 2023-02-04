package it.develhope.JavaAvanzato.WildCards1;

import java.util.List;

public class Student {
    String studentName;
    String studentSurname;
    double marksAverage;

    public Student(String studentName, String studentSurname, double marksAverage) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.marksAverage = marksAverage;
    }

    public static double getAverageMark(List<? extends Number> listOfMarks) {
        double mark1 = listOfMarks.get(0).doubleValue() *100;
        double mark2 = listOfMarks.get(1).doubleValue() *100;
        double sum = Math.round(mark1 + mark2) / 2;
        return sum / 100;
    }
    @Override
    public String toString() {
        return "Student{ " +
                "studentName = " + studentName +
                ", studentSurname = " + studentSurname +
                ", marksAverage = " + marksAverage +
                " }";
    }
}