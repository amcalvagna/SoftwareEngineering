package model;
 

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Student {
    private Double grade;
    private Integer graduationYear;

    public Student() {
    }

    public Student(double grade, int graduationYear) {
        this.grade = grade;
        this.graduationYear = graduationYear;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Integer getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Integer graduationYear) {
        this.graduationYear = graduationYear;
    }

    public static List<Student> createList() {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student(95, 2015));
        students.add(new Student(88, 2015));
        students.add(new Student(67, 2015));
        students.add(new Student(86, 2016));
        students.add(new Student(91, 2016));
        students.add(new Student(50, 2016));
        students.add(new Student(30, 2014));
        students.add(new Student(100, 2014));
        students.add(new Student(70, 2014));

        return students;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", graduationYear=" + graduationYear +
                '}';
    }

    // public Function<String,Boolean> getff() {
    //     return s -> Integer.parseInt(s) == this.getGraduationYear();
    // }

}
