package intro;

import model.Student;

public class MyFilter implements MyPredicate<Student, Integer>{
    public boolean test(Student s, Integer year){
        return s.getGraduationYear() == year || s.getGraduationYear() == year-1;
    }
}

