package syntax;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import model.Student;

public class Problem {

    // The following methods are used to demonstrate the correct syntax for lambdas
    private static void consumeStudent(Consumer<Student> consumer) {
        Student s = new Student();
        consumer.accept(s);
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

        consumeStudent(exampleConsumer); // This is an instance of an (anonymous) class
        // * SOLUTIONS 
        // The following are all valid lambda expressions that can be used in place of the above anonymous class
        // no class instance is created for the lambda expression
        consumeStudent((Student s) -> System.out.println(s.getGraduationYear()));
        consumeStudent((s) -> System.out.println(s.getGraduationYear()));
        consumeStudent(s -> System.out.println(s.getGraduationYear()));

        Consumer<Student> exampleConsumer2 = (Student s) -> System.out.println(s.getGraduationYear());
        consumeStudent(exampleConsumer2); 

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
