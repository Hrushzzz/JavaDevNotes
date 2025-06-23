package lambdas;

public class StatusNodeValidator implements Validator {
    @Override
    public boolean validate() {
        System.out.println("Validating Status Node -> StatusNodeValidator");
        return true;
    }
}
