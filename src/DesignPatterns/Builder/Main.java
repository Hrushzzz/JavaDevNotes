package DesignPatterns.Builder;

import DesignPatterns.Builder.preInnerClasses.Student;
import DesignPatterns.Builder.preInnerClasses.StudentHelper;
import DesignPatterns.Builder.preInnerClasses.StudentValidator;

public class Main {
    public static void main(String[] args) {

        // PreInner classes ::
        Student student = null;
        StudentHelper studentHelper = new StudentHelper(17, "Hrishi", 25, 100,
                "R15 Batch", "IIIT - RK Valley", 2021, "9494063682");
        boolean isValid = StudentValidator.validate(studentHelper);
        student = new Student(studentHelper);
        System.out.println(student.toString());
    }
}
