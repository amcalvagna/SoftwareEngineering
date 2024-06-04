package debugging;

import java.util.List;

import model.Student;

public class Debugging02 {
    public static void main(String args[]) {
        List<Student> students = Student.createList();


        students.forEach(Debugging02::process);
        students.replaceAll(Debugging02::replaceAll);
    }

    private static void process(Student s){
        if (s.getGraduationYear() == 2014) {
            System.out.println(s);
        } else {
            System.out.println("Not 2014");
        }
    }

    private static Student replaceAll(Student s){
        s.setGrade(s.getGrade() - 1.0);

        return s;
    }
}
