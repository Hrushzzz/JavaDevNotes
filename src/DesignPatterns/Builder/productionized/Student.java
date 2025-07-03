package DesignPatterns.Builder.productionized;

public class Student {
    private int id;
    private String name;
    private int age;
    private double marks;
    private String batch;
    private String universityName;
    private int gradYear;
    private String phoneNumber;

    public Student(int id, String name, int age, double marks,
                   String batch, String universityName, int gradYear, String phoneNumber) {
        this(id, name, marks);  // This is called as "Constructor Telescoping"
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

    // --> 6. Add a static method in Student to get StudentHelper object
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student {" +
                "id=" + id +
                ", name= '" + name + '\'' +
                ", psp= " + marks +
                ", age= " + age +
                ", batch= '" + batch + '\'' +
                ", universityName= '" + universityName + '\'' +
                ", gradYear= " + gradYear +
                ", phoneNumber= '" + phoneNumber + '\'' +
                "}";
    }

    // --> 1. Moved the StudentHelper class as a static inner class inside Student.
    public static class Builder {
        private int id;
        private String name;
        private int age;
        private double marks;
        private String batch;
        private String universityName;
        private int gradYear;
        private String phoneNumber;

        public Builder() {}

        // --> 2. Removed all getters from StudentHelper, as it's only for validations, and won't be used anywhere else in code
        // --> 3. Since, we don't have getters and setters, we only have setters, we don't need to put prefix in names,
        // like setName() or setAge(). only name(..), age(..) will suffice and would make code shorter/readable.

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder marks(double marks) {
            this.marks = marks;
            return this;
        }

        public Builder batch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        // --> 4. put all the validations inside StudentHelper method with a method called validate()
        private void validate(){
            if(this.age < 18)
                throw new InvalidAgeException("Age must be at least 18");
            if(this.gradYear > 2025){
                throw new InvalidGradYearException("Grad year must be 2025 or earlier");
            }
            if(this.name == null || this.name.isBlank() || this.name.isEmpty()){
                throw new InvalidNameException("Name cannot be empty");
            }
        }

        // --> 5. Created a method called build() -> which would return a Student object post validation.
        public Student build(){
            validate();   // first it validates -> if anything goes wrong, it throws exception
            return new Student(this.id, this.name, this.age, this.marks, this.batch, this.universityName, this.gradYear, this.phoneNumber);
        }

    }
}
