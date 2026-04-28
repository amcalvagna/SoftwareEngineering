package functionalinterfaces;

import model.Student;

// example of how users can define their own types of functional interface 
//@FunctionalInterface
public interface Example01 {
    String printStudentName(Student student);
    void pippo();
}
