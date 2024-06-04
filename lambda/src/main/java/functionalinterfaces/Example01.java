package functionalinterfaces;

import model.Student;

@FunctionalInterface
public interface Example01 {
    String printStudentName(Student student);
}
