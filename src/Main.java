import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ferrux", 18, 101);
        student.addSubjectAndMark(50, "English");

        Student student1 = new Student("Nihad", 18, 102);
        student1.addSubjectAndMark(100, "Math");

        Teacher teacher = new Teacher("Fərid Mustafayev", 24, "Informatika");
        teacher.setAssignedStudent(student);

        Teacher teacher1 = new Teacher("Aytac Mammadli", 28, "Informatika");
        teacher1.setAssignedStudent(student1);


        teacher.displayInfo();
        teacher1.displayInfo();

        System.out.println(student.calculateAverageMarks());
        System.out.println(student1.calculateAverageMarks());


    }


}