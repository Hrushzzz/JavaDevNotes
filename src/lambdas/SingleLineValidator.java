package lambdas;

public class SingleLineValidator implements Validator {
    @Override
    public boolean validate() {
        return StaticValidation.validate();
    }
}
