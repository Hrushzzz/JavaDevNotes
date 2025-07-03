package DesignPatterns.Builder.preInnerClasses;

public class Student {
    private int id;
    private String name;
    private int age;
    private double marks;
    private String batch;
    private String universityName;
    private int gradYear;
    private String phoneNumber;

    public Student(StudentHelper studentHelper) {
        // calls parent class constructor
        this(studentHelper.getId(), studentHelper.getName(),
                studentHelper.getAge(), studentHelper.getMarks(),
                studentHelper.getBatch(), studentHelper.getUniversityName(),
                studentHelper.getGradYear(), studentHelper.getPhoneNumber());
    }

    public Student(int id, String name, int age, double marks,
                   String batch, String universityName, int gradYear, String phoneNumber) {
        this(id, name, marks);
        this.age = age;
        this.batch = batch;
        this.universityName = universityName;
        this.gradYear = gradYear;
        this.phoneNumber = phoneNumber;
    }

    public Student (int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
