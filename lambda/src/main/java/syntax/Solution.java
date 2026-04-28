package syntax;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import model.Student;

public class Solution {
     
    // this is an attribute, not a method, containing a lambda expression
    static Consumer<Student> consumer = x -> System.out.print(x.getGrade()+" ");
    List<Student> students = Student.createList();

    // this is a instance method using the lambda expression in instance field consumer
    void consumerMethod(Student s) { consumer.accept(s);}       
    static void staticConsumerMethod(Student s) { consumer.accept(s); }

    // CLASS METHODS
    // this applies an external lambda
    void consumeStudent(Student s, Consumer<Student> consumer) {
        consumer.accept(s);
    }

    // so does these, with no student param...does nothing
    private static void consumeStudent(Consumer<Student> consumer) {
        consumer.accept(new Student(33, 2026));
    }
    private static Double functionStudent(Function<Student, Double> function) {
        return 1.0/3*function.apply(new Student(66, 2026));
    }

    private static Student supplyStudent(Supplier<Student> supplier) {
        return supplier.get();
    }


    // demonstrate ways of passing a method reference or a lambda
    void foo (Solution sol) { 
        sol.students.forEach(sol::consumerMethod); // instance method ref.
        System.out.println();
        sol.students.forEach(s -> consumeStudent(s, sol::consumerMethod));  // lambda, using a method which in turn pass a method ref as lambda
        System.out.println();
        //sol.students.forEach(sol/Solution::consumer); // wrong. consumer is an attribute, not a method
        sol.students.forEach(sol.consumer);  // as attribute value (even if it is static)
        System.out.println();
        sol.students.forEach(consumer); // as local attribute value
        System.out.println();
        //sol.students.forEach(Solution::consumerMethod); // wrong. it is not a class method
        //sol.students.forEach(Solution::consumeStudent); // wrong. does not take a  Student as required by consumer interface: apply(T)
        sol.students.forEach(Solution::staticConsumerMethod); // as class attribute value
        System.out.println();
    }

    public static void main(String args[]) throws IOException{
        Solution sol = new Solution();
        sol.foo(sol);

        System.in.read();
        consumeStudent((s) -> System.out.println(s.getGrade()));

        System.in.read();
        System.out.println( functionStudent((s) ->  s.getGrade()) );
        
        System.in.read();
        System.out.println( functionStudent((Student s) -> {
            return s.getGrade();
        }) );
        
        System.in.read();
        System.out.println( supplyStudent(() -> new Student(100,1972)) );

        System.in.read();
        System.out.println( supplyStudent(Student::new) );
        
        System.in.read();
        Student s = supplyStudent(() -> {
            Student student = new Student();

            student.setGrade(95.0);
            student.setGraduationYear(2016);
    
             return student;

        });
        System.out.println(s);
    }
    
}
