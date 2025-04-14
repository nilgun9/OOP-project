
import java.util.*;

class Student extends Human {
    private int studentId;
    private List<Course> courses;
    private List<Integer> grades;
    private String department;
    private int year;

    public Student(String name, String surname, int age, String gender, String email, int studentId, String department, int year) {
        super(name, surname, age, gender, email);
        this.studentId = studentId;
        this.department = department;
        this.year = year;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void joinCourse(Course course) {
        courses.add(course);
    }

    public void receiveGrade(int grade) {
        grades.add(grade);
    }

    public int getStudentId() { return studentId; }
    public List<Course> getCourses() { return courses; }
    public List<Integer> getGrades() { return grades; }
    public String getDepartment() { return department; }
    public int getYear() { return year; }
}
