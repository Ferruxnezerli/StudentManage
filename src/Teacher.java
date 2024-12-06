import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private int id;
    private String subject;
    private List<Student>assignedStudent;

    public Teacher(String name, int age,String subject) {
        super(name, age);
        ++id;
        this.subject = subject;
        assignedStudent = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Student> getAssignedStudent() {
        return assignedStudent;
    }

    public void setAssignedStudent(Student assignedStudent) {
        this.assignedStudent.add(assignedStudent);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", assignedStudent=" + assignedStudent +
                '}';
    }

    @Override
    public void displayInfo() {
        System.out.println("name: "+getName());
        System.out.println("age: "+getAge());
        System.out.println("Subject: "+getSubject());

        for (int i = 0; i < assignedStudent.size(); i++) {
            System.out.println("student: "+assignedStudent.get(i).getName());
            System.out.println("rollNumber: "+assignedStudent.get(i).getRollNumber());

        }
    }

}
