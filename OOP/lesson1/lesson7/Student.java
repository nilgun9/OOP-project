
public class Student implements Comparable<Student> {
    private final long id;
    private final String name;
    private final String surname;
    private final boolean isFemale;
    private double grade;
    private final int birthYear;

    public Student(long id, String name, String surname, boolean isFemale, double grade, int birthYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.isFemale = isFemale;
        this.grade = grade;
        this.birthYear = birthYear;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean getIsFemale() {
        return isFemale;
    }

    public double getGrade() {
        return grade;
    }
    public int getBirthYear() {return birthYear;}


    @Override
    public int compareTo(Student that) {
        return Long.compare(id, that.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", birthYear=" + birthYear +
                ", name='" + name +
                ", surname='" + surname +
                ", gender=" + (isFemale?"Female":"Male") +
                ", grade=" + grade;

    }
}