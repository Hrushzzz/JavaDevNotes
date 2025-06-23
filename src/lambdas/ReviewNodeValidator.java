package lambdas;

public class ReviewNodeValidator implements Validator {
    @Override
    public boolean validate() {
        System.out.println("Validating Review Node -> ReviewNodeValidator");
        return true;
    }
}
