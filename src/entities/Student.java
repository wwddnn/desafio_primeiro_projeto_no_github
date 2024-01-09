package entities;

public class Student {

    private String name;
    private String schoolSubject;
    private Integer age;

    public Student() {
    }

    public Student(String name, String schoolSubject, Integer age) {
        this.name = name;
        this.schoolSubject = schoolSubject;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolSubject() {
        return schoolSubject;
    }

    public void setSchoolSubject(String schoolSubject) {
        this.schoolSubject = schoolSubject;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student data: " + "\n" +
                "Name: " + getName() + "\n" +
                "School subject: " + getSchoolSubject() + "\n" +
                "Age: " + getAge();
    }
}
