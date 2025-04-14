
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Smith", 20, "Male", "john@mail.com", 1001, "Computer Science", 2));
        students.add(new Student("Emily", "Johnson", 21, "Female", "emily@mail.com", 1002, "Computer Science", 2));
        students.add(new Student("Michael", "Williams", 19, "Male", "michael@mail.com", 1003, "Engineering", 1));
        students.add(new Student("Sarah", "Brown", 22, "Female", "sarah@mail.com", 1004, "Engineering", 3));
        students.add(new Student("David", "Jones", 20, "Male", "david@mail.com", 1005, "Mathematics", 2));

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Robert", "Wilson", 45, "Male", "robert@university.com", 2001, "Computer Science", 15, "PhD"));
        teachers.add(new Teacher("Jennifer", "Taylor", 38, "Female", "jennifer@university.com", 2002, "Mathematics", 10, "PhD"));

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("CS101", "Introduction to Programming", 6));
        courses.add(new Course("CS102", "Data Structures", 6));
        courses.add(new Course("MATH101", "Calculus I", 4));
        courses.add(new Course("MATH102", "Linear Algebra", 4));

        teachers.get(0).teachCourse(courses.get(0));
        teachers.get(0).teachCourse(courses.get(1));
        teachers.get(1).teachCourse(courses.get(2));
        teachers.get(1).teachCourse(courses.get(3));

        List<Exam> exams = new ArrayList<>();

        for (Student student : students) {
            student.joinCourse(courses.get(0));
            student.joinCourse(courses.get(2));
            courses.get(0).enrollStudent(student);
            courses.get(2).enrollStudent(student);
        }

        for (Course course : courses) {
            course.conductExam();
            for (Student student : course.getEnrolledStudents()) {
                if (!student.getGrades().isEmpty()) {
                    exams.add(new Exam(student, course.getInstructor(),
                            student.getGrades().get(student.getGrades().size() - 1)));
                }
            }
        }

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.findAndRegisterModules();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(new File("students.json"), students);
            mapper.writeValue(new File("teachers.json"), teachers);
            mapper.writeValue(new File("courses.json"), courses);
            mapper.writeValue(new File("exams.json"), exams);

            System.out.println("Data successfully written to JSON files");
        } catch (IOException e) {
            System.err.println("Error writing JSON files: " + e.getMessage());
        }
    }
}
