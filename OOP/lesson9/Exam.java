
class Exam {
    private Student student;
    private Teacher examiner;
    private int score;
    private String examDate;
    private String courseName;

    public Exam(Student student, Teacher examiner, int score) {
        this.student = student;
        this.examiner = examiner;
        this.score = score;
        this.examDate = "2023-12-15";
        this.courseName = examiner.getTeachingCourses().get(0).getCourseName();
    }

    public Student getStudent() { return student; }
    public Teacher getExaminer() { return examiner; }
    public int getScore() { return score; }
    public String getExamDate() { return examDate; }
    public String getCourseName() { return courseName; }
}
