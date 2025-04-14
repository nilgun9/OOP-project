
import java.util.*;

class Teacher extends Human implements Teachable, Gradable {
    private int teacherId;
    private String specialization;
    private int yearsOfExperience;
    private List<Course> teachingCourses;
    private String degree;

    public Teacher(String name, String surname, int age, String gender, String email, int teacherId, String specialization, int yearsOfExperience, String degree) {
        super(name, surname, age, gender, email);
        this.teacherId = teacherId;
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
        this.degree = degree;
        this.teachingCourses = new ArrayList<>();
    }

    @Override
    public void teachCourse(Course course) {
        teachingCourses.add(course);
        course.setInstructor(this);
    }

    @Override
    public void gradeStudent(Student student, int score) {
        Exam exam = new Exam(student, this, score);
        student.receiveGrade(score);
    }

    public int getTeacherId() { return teacherId; }
    public String getSpecialization() { return specialization; }
    public int getYearsOfExperience() { return yearsOfExperience; }
    public List<Course> getTeachingCourses() { return teachingCourses; }
    public String getDegree() { return degree; }
}
