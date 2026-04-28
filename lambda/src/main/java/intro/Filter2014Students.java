package intro;

import java.util.function.Predicate;

import model.Student;

public class Filter2014Students implements Predicate<Student> {
    @Override
    public boolean test(Student student) {
        return student.getGraduationYear() == 2014;
    }
}
