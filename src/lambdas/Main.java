package lambdas;

public class Main {
    public static void main(String[] args) {
        // FUNCTIONAL INTERFACE ::
        // A functional interface in Java is an interface that has exactly one abstract method.
        // Functional interfaces act as the target type for lambda expressions.
        //  If you accidentally add a second abstract method, it will give you a compile-time error.

        // ANONYMOUS CLASSES ::
        // We create Anonymous classes when:
        // -> Use case for the object is very limited/rare.
        // -> The implementations of the methods change every time.
        // Anonymous classes are only for creating objects for Interfaces.

        StatusNodeValidator statusNodeValidator = new StatusNodeValidator();
        statusNodeValidator.validate();

        ReviewNodeValidator reviewNodeValidator = new ReviewNodeValidator();
        reviewNodeValidator.validate();

        // So, instead of creating classes like these for minimal use case, we can create an ANONYMOUS CLASS.
        Validator statusNodeValidatorAC = new Validator() {   // statusNodeValidatorAnonymousClass
            @Override
            public boolean validate() {
                System.out.println("Anonymous class - StatusNodeValidator");
                return true;
            }
        };
        statusNodeValidatorAC.validate();

        Validator reviewNodeValidatorAC = new Validator() {   // reviewNodeValidatorAnonymousClass
            @Override
            public boolean validate() {
                System.out.println("Anonymous class - ReviewNodeValidator");
                return true;
            }
        };
        reviewNodeValidatorAC.validate();
        // Anonymous class - Helps to create objects from an interface
        // definition of methods by giving their implementations

        /*
        Syntax to create Anonymous Classes ::
        InterfaceName objName = new InterfaceNAme() {
            // implement all the methods for the Interface (all methods are mandatory)
            public void method1(){
            }
            public void method2(){
            }
        };
         */




    }
}
