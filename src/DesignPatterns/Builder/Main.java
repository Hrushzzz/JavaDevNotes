package DesignPatterns.Builder;

import DesignPatterns.Builder.productionized.Student;

public class Main {
    public static void main(String[] args) {

        // PreInner classes ::
        /*
        Student student = null;
        StudentHelper studentHelper = new StudentHelper(17, "Hrishi", 25, 100,
                "R15 Batch", "IIIT - RK Valley", 2021, "9494063682");
        boolean isValid = StudentValidator.validate(studentHelper);
        student = new Student(studentHelper);
        System.out.println(student.toString());

         */


        // Productionized Classes :: (using Inner classes)
        Student.Builder builder = Student.builder();
        builder = builder.id(1);
        builder = builder.marks(99);
        // Student.builder().id(1).marks(99)
        //Student.builder(); // returns empty StudentHelper object
        Student student = Student.builder()
                .id(6)
                .marks(99)
                .name("Hrushikesh")
                .gradYear(2022)
                .age(25)
                .universityName("RKV")
                .batch("R15 Elite Batch")
                .phoneNumber("1234567890")
                .build();
        System.out.println(student);

    }
}


// student object not getting created before validation -> DONE
// too many params, bad readability -> DONE
// all logic should be inside Student class -> YES

/*
      1. Moved the StudentHelper class as a static inner class inside Student.
      2. Removed all getters from StudentHelper, as it's only for validations, and won't be used anywhere else in code.
      3. Since, we don't have getters and setters, we only have setters,we don't need, to put prefix in names,
            like setName() or setAge() . Only, name(..), age(..) will suffice and would make code shorter/readable.
      4. Put all the validations inside StudentHelper method with a method called validate().
      5. Created a method called build() -> which would return a Student object post validation.
      6. Add a static method in Student to get StudentHelper object.
      7. Follow ->
         ClassName obj =  ClassName.builder()
                        .attr1()
                        .attr2()
                        .attr3()
                        .build();
 */
