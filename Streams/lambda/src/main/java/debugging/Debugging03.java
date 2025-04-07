package debugging;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import model.Student;

class ProcessStudents implements Consumer<Student>{
    @Override
    public void accept(Student s) {
        if (s.getGraduationYear() == 2014) {
            System.out.println(s);
        } else {
            System.out.println("Not 2014");
        }
    }
}

class ReplaceAllStudents implements UnaryOperator<Student>{
    @Override
    public Student apply(Student s) {
        s.setGrade(s.getGrade() - 1.0);

        return s;
    }
}

public class Debugging03 {
    public static void main(String args[]) {
        List<Student> students = Student.createList();

        students.forEach(new ProcessStudents());
        students.replaceAll(new ReplaceAllStudents());
    }
}
