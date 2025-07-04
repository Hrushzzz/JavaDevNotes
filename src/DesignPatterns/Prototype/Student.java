package DesignPatterns.Prototype;

public class Student implements Prototype<Student> {
    private int id;
    private String name;
    private String contactDetails;
    private double marks;
    private String batchName;
    private int batchId;
    private String classTeacherName;
    private String module;
    private String schedule;
    private double avgClassMarks;
    private double classAttendance;

    @Override
    public Student copy() {
        Student copy = new Student();
        copy.batchName = this.batchName;
        copy.batchId = this.batchId;
        copy.classTeacherName = this.classTeacherName;
        copy.module = this.module;
        copy.schedule = this.schedule;
        copy.avgClassMarks = this.avgClassMarks;
        copy.classAttendance = this.classAttendance;
        return copy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getClassTeacherName() {
        return classTeacherName;
    }

    public void setClassTeacherName(String classTeacherName) {
        this.classTeacherName = classTeacherName;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public double getAvgClassMarks() {
        return avgClassMarks;
    }

    public void setAvgClassMarks(double avgClassMarks) {
        this.avgClassMarks = avgClassMarks;
    }

    public double getClassAttendance() {
        return classAttendance;
    }

    public void setClassAttendance(double classAttendance) {
        this.classAttendance = classAttendance;
    }
}
