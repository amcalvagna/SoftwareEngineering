package intro;

import java.util.List;

import model.Student;

public class Parameters01 {
    private static double highestGrade2014(List<Student> students) {
        double highestScore = 0.0;

        for (Student student : students) {
            if (student.getGraduationYear() == 2014) {
                if (student.getGrade() > highestScore) {
                    highestScore = student.getGrade();
                }
            }
        }

        return highestScore;
    }

    private static double highestGrade2015(List<Student> students) {
        double highestScore = 0.0;

        for (Student student : students) {
            if (student.getGraduationYear() == 2015) {
                if (student.getGrade() > highestScore) {
                    highestScore = student.getGrade();
                }
            }
        }

        return highestScore;
    }

    private static double highestGrade2016(List<Student> students) {
        double highestScore = 0.0;

        for (Student student : students) {
            if (student.getGraduationYear() == 2016) {
                if (student.getGrade() > highestScore) {
                    highestScore = student.getGrade();
                }
            }
        }

        return highestScore;
    }

    private static double highestGradeCurrentAndPrevious(List<Student> students) {
        double highestScore = 0.0;

        for (Student student : students) {
            if (student.getGraduationYear() == 2016 || student.getGraduationYear() == 2015) {
                if (student.getGrade() > highestScore) {
                    highestScore = student.getGrade();
                }
            }
        }

        return highestScore;
    }

    public static void main(String args[]) {
        List<Student> students = Student.createList();

        double highestGrade2014 = highestGrade2014(students);
        double highestGrade2015 = highestGrade2015(students);
        double highestGrade2016 = highestGrade2016(students);
        double highestGradeCurrentAndPrevious = highestGradeCurrentAndPrevious(students);

        System.out.println("Highest Grades");
        System.out.println("2014: " + highestGrade2014);
        System.out.println("2015: " + highestGrade2015);
        System.out.println("2016: " + highestGrade2016);
        System.out.println("Current and Previous: " + highestGradeCurrentAndPrevious);
    }
}
