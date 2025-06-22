package exceptionHandling;

// CUSTOM EXCEPTION ::

public class CalculatorException extends RuntimeException {
    public CalculatorException() {}

    public CalculatorException(String message) {}

    public CalculatorException(String message, Throwable cause) {
        super(message, cause);
    }
}
