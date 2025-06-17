package oops01;

public class Student {
//    private int id;
//    private String name;
//    private String school;

     int id;
     String name;
     String school;

    public Student() {
    }

    public Student(int sId) {
        id = sId;
    }

    public Student(int sId, String sName) {
        id = sId;
        name = sName;
    }

    public Student(Student student) {
        id = student.id;
        name = student.name;
    }

    public Student(int id, String name, String school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }

    public void print() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student School: " + school);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        // We can add null checks here / any other validations too
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
