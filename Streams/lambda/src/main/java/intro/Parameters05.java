package intro;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import model.Student;

public class Parameters05 {
    private static double highestGrade(List<Student> students, Predicate<Student> filterStudents) {
        return students.stream()
                .filter(filterStudents)
                .mapToDouble(Student::getGrade)
                .max()
                .getAsDouble();
    }

    // Integer graduationYear = 2015;
    // private static boolean test(Function<String, Boolean> f){ 
    //     return f.apply("2014");
    // }

    // void foo () { 
    //     Function<String,Boolean> ff = (new Student(10,2014)).getff();
    //     System.out.println( "test1="+ test(s -> Integer.parseInt(s) == this.graduationYear));        
    //     System.out.println( "test2="+ test(ff));
    // }

    public static void main(String args[]) {
       List<Student> students = Student.createList();

       //    Parameters05 p = new Parameters05();
    //    p.foo();

    double highestGrade2014 = highestGrade(students, s -> s.getGraduationYear() == 2014);
       double highestGrade2015 = highestGrade(students, s -> s.getGraduationYear() == 2015);
       double highestGrade2016 = highestGrade(students, s -> s.getGraduationYear() == 2016);
       double highestGradeCurrentAndPrevious = highestGrade(students, s -> s.getGraduationYear() == 2016 || s.getGraduationYear() == 2015);

       System.out.println("Highest Grades");
       System.out.println("2014: " + highestGrade2014);
       System.out.println("2015: " + highestGrade2015);
       System.out.println("2016: " + highestGrade2016);
       System.out.println("Current and Previous: " + highestGradeCurrentAndPrevious);
    }
}
