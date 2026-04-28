package intro;

import java.util.List;

import model.Student;

public class Parameters02 {
    private static double highestGrade(List<Student> students, int graduationYear) {
        double highestScore = 0.0;

        for (Student student : students) {
            if (student.getGraduationYear() == graduationYear) {
                if (student.getGrade() > highestScore) {
                    highestScore = student.getGrade();
                }
            }
        }

        return highestScore;
    }

    private static double highestGradeCurrentAndPrevious(List<Student> students, int currentGraduationYear) {
        double highestScore = 0.0;

        for (Student student : students) {
            if (student.getGraduationYear() == currentGraduationYear || student.getGraduationYear() == currentGraduationYear - 1) {
                if (student.getGrade() > highestScore) {
                    highestScore = student.getGrade();
                }
            }
        }

        return highestScore;
    }

    public static void main(String args[]) {
        List<Student> students = Student.createList();

        double highestGrade2014 = highestGrade(students, 2014);
        double highestGrade2015 = highestGrade(students, 2015);
        double highestGrade2016 = highestGrade(students, 2016);
        double highestGradeCurrentAndPrevious = highestGradeCurrentAndPrevious(students, 2016);

        System.out.println("Highest Grades");
        System.out.println("2014: " + highestGrade2014);
        System.out.println("2015: " + highestGrade2015);
        System.out.println("2016: " + highestGrade2016);
        System.out.println("Current and Previous: " + highestGradeCurrentAndPrevious);
    }
}
