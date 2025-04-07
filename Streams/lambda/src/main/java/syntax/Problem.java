package syntax;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import model.Student;

public class Problem {
    private static void consumeStudent(Consumer<Student> consumer) {
    }

    private static void supplyStudent(Supplier<Student> supplier) {
    }

    private static void functionStudent(Function<Student, Double> function) {
    }

    // Replace the inner classes with lambdas
    public static void main(String args[]) {
        // * EXAMPLE
        Consumer<Student> exampleConsumer = new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student.getGraduationYear());
            }
        };

        consumeStudent(exampleConsumer);
        // * SOLUTIONS
        consumeStudent((Student s) -> System.out.println(s.getGraduationYear()));
        consumeStudent((s) -> System.out.println(s.getGraduationYear()));
        consumeStudent(s -> System.out.println(s.getGraduationYear()));


        //-------------------------------------------------------------
        Consumer<Student> consumer = new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student.getGrade());
            }
        };

        consumeStudent(consumer);


        //-------------------------------------------------------------
        Supplier<Student> supplier = new Supplier<Student>() {
            @Override
            public Student get() {
                return new Student();
            }
        };

        supplyStudent(supplier);


        //-------------------------------------------------------------
        Function<Student, Double> function = new Function<Student, Double>() {
            @Override
            public Double apply(Student student) {
                return student.getGrade();
            }
        };

        functionStudent(function);


        //-------------------------------------------------------------
        Supplier<Student> multiSupplier = new Supplier<Student>() {
            @Override
            public Student get() {
                Student student = new Student();

                student.setGrade(95.0);
                student.setGraduationYear(2016);

                return student;
            }
        };

        supplyStudent(multiSupplier);
    }
}
