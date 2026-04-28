package intro;

import java.util.List;
import java.util.function.Predicate;

import model.Student;

public class Parameters04 {
    private static double highestGrade(List<Student> students, Predicate<Student> filterStudents) {
        double highestScore = 0.0;

        for (Student student : students) {
            if (filterStudents.test(student)) {
                if (student.getGrade() > highestScore) {
                    highestScore = student.getGrade();
                }
            }
        }

        return highestScore;
    }

    public static void main(String args[]) {
        List<Student> students = Student.createList();

        double highestGrade2014 = highestGrade(students, s -> s.getGraduationYear() == 2014);
        double highestGrade2015 = highestGrade(students, s -> s.getGraduationYear() == 2015);
        double highestGrade2016 = highestGrade(students, s -> s.getGraduationYear() == 2016);
        double highestGradeCurrentAndPrevious = highestGrade(students, s -> s.getGraduationYear() == 2016 || s.getGraduationYear() == 2015);

        System.out.println("Highest Grades");
        System.out.println("2014: " + highestGrade2014);
        System.out.println("2015: " + highestGrade2015);
        System.out.println("2016: " + highestGrade2016);
        System.out.println("Current and Previous: " + highestGradeCurrentAndPrevious);
    }
}
