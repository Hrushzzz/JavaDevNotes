package DesignPatterns.Builder.productionized;

public class InvalidNameException extends RuntimeException {

    public InvalidNameException() {}

    public InvalidNameException(String message) {
        super(message);
    }

    public InvalidNameException(String message, Throwable cause) {
        super(message, cause);
    }
}
