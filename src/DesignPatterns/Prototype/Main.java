package DesignPatterns.Prototype;

public class Main {
    public static void main(String[] args) {
        Student batch01Prototype = new Student();
        batch01Prototype.setName("Batch 01");
        batch01Prototype.setBatchId(1);
        batch01Prototype.setClassTeacherName("Koushik");
        batch01Prototype.setModule("Data Structures and Algorithms");
        batch01Prototype.setSchedule("Monday - Friday");
        batch01Prototype.setAvgClassMarks(68.99);
        batch01Prototype.setClassAttendance(80);


        Student hrushikesh = batch01Prototype.copy();
        hrushikesh.setName("Hrushikesh");
        hrushikesh.setId(1);
        hrushikesh.setContactDetails("9494063682");
        hrushikesh.setMarks(91);

        Student manideep = batch01Prototype.copy();
        manideep.setName("Manideep");
        manideep.setId(2);
        manideep.setContactDetails("123456789");
        manideep.setMarks(95);

    }
}
