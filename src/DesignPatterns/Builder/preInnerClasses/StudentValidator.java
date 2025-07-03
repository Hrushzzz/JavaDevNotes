package DesignPatterns.Builder.preInnerClasses;

public class StudentValidator {

    public static boolean validate(StudentHelper studentHelper) {
        return validateAge(studentHelper.getAge()) &&
                validateName(studentHelper.getName()) &&
                validateGradYear(studentHelper.getGradYear()) &&
                validatePhoneNumber(studentHelper.getPhoneNumber());
    }

    public static boolean validateAge(int age) {
        return age >= 18;
    }

    public static boolean validateName(String name) {
        return name != null && !name.isEmpty();
    }

    public static boolean validateGradYear(int gradYear) {
        return gradYear <= 2025;
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.length() == 10;
    }
}
