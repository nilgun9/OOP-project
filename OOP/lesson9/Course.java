
import java.util.*;

class Course {
    private String courseId;
    private String courseName;
    private int credit;
    private Teacher instructor;
    private List<Student> enrolledStudents;

    public Course(String courseId, String courseName, int credit) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credit = credit;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.joinCourse(this);
    }

    public void conductExam() {
        for (Student student : enrolledStudents) {
            int score = (int) (Math.random() * 100);
            instructor.gradeStudent(student, score);
        }
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public String getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
    public int getCredit() { return credit; }
    public Teacher getInstructor() { return instructor; }
    public List<Student> getEnrolledStudents() { return enrolledStudents; }
}
