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

        Student batch02Prototype = new Student();
        batch02Prototype.setName("Batch 02");
        batch02Prototype.setBatchId(2);
        batch02Prototype.setClassTeacherName("Dheeraj");
        batch02Prototype.setModule("System Design");
        batch02Prototype.setSchedule("Saturday - Sunday");
        batch02Prototype.setAvgClassMarks(54.31);
        batch02Prototype.setClassAttendance(62);

        // If we have multiple Prototypes, then we can create a Hashmap and
        // them into it. This is called as "REGISTRY" design pattern
        Registry<Student> registry = new Registry<>();
        registry.add("Batch 01", batch01Prototype);
        registry.add("Batch 02", batch02Prototype);

        // Creating Students of Batch 01 :::
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

        // Creating Students of Batch 02 :::
        Student arun = batch02Prototype.copy();
        arun.setName("Arun");
        arun.setId(3);
        arun.setContactDetails("987654321");
        arun.setMarks(60);

        Student surendra = batch02Prototype.copy();
        surendra.setName("Surendra");
        surendra.setId(4);
        surendra.setContactDetails("9191919191");
        surendra.setMarks(20);

    }
}
