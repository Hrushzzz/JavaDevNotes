package DesignPatterns.Builder.productionized;

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException() {}

    public InvalidAgeException(String message) {
        super(message);
    }

    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
