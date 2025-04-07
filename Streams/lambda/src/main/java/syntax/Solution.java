package syntax;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import model.Student;

public class Solution {
    private static void consumeStudent(Consumer<Student> consumer) {
    }

    private static void supplyStudent(Supplier<Student> supplier) {
    }

    private static void functionStudent(Function<Student, Double> function) {
    }

    public static void main(String args[]) {
        consumeStudent((s) -> System.out.println(s.getGrade()));

        supplyStudent(() -> new Student());

        functionStudent((Student s) -> {
            return s.getGrade();
        });

        supplyStudent(() -> {
            Student student = new Student();

            student.setGrade(95.0);
            student.setGraduationYear(2016);


             
             return student;

        });
    }
}
