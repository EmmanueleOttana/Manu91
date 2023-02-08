package it.develhope.javaBase.constructor2;

public class Teacher {
    public String teacherName;
    public void creationTeacher(String teacher){
        this.teacherName = teacher;
        System.out.println(this.teacherName +" teacher object was created");
    }
    public void assignGrade(Student alum, int finalGrade){
        alum.grade = finalGrade;
        alum.getStudentDetails();
    }
}
