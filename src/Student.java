import java.util.ArrayList;
import java.util.List;

public  class Student extends Person {

    private int rollNumber;
    private List<String> Subjects;
    private List<Integer> marks;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
        Subjects=new ArrayList<>();
        marks=new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("rollnumber: "+rollNumber);
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());

        for (int i = 0; i < Subjects.size(); i++) {
            System.out.println(Subjects.get(i));
            System.out.println(marks.get(i));
        }
    }


    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public List<String> getSubject() {
        return Subjects;
    }

    public void setSubject(List<String> subject) {
        Subjects = subject;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public void addSubjectAndMark(Integer mark, String subject) {
        if (mark < 0 || mark > 100) {
            throw new WrongNumber("Wrong Number");
        }
        marks.add(mark);
        Subjects.add(subject);
    }

    public void calculateAverageMarks(){
         int sum=0;
        for (int i = 0; i < marks.size(); i++) {
            sum=sum+marks.get(i);
        }
        System.out.println("Average: "+sum/marks.size());
    }
}
