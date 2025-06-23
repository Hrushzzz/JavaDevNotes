package lambdas;

@FunctionalInterface  // this is for readability purposes, it doesn't make any diff in execution.
public interface Validator {
    boolean validate();
}
