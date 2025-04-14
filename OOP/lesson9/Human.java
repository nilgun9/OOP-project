
abstract class Human {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String email;

    public Human(String name, String surname, int age, String gender, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getEmail() { return email; }
}
