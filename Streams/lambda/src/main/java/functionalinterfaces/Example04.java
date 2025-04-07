package functionalinterfaces;

import model.Student;

public interface Example04 {
    String printStudentName(Student student);
    boolean equals(Object obj);  //implementazione implicitamente ereditata da Object
}
