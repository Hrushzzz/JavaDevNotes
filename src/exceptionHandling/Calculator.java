package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Calculator<X, Y> {
    private X x;
    private Y y;

    public Calculator(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    // Type 01 : divide method with try/catch -> handling exception inside the method
    public void divide(int a, int b) {
        System.out.println("Entered divide operation");
        try {
            System.out.println(a / b);
            String str = "str";
            str.length();

        } catch (ArithmeticException e) {   // ALWAYS GO FROM SPECIFIC TO GENERIC EXCEPTION - TOP DOWN IN CATCH BLOCK
            System.out.println("Error is :: Arithmetic exception - Divide by Zero");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error is :: String is null");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error is :: Something went wrong");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I'll happen in the all the scenarios");
        }
    }

    // run time exception -> exception is propagated upwards automatically -- IMPLICIT
    // compile exception -> either handle with try/catch or propagate upwards using "throws" --- EXPLICIT


    // Type 02 : divide method and throwing method upwards

    // here, just `throws Exception` can do the job but mentioning the specific exceptions is better for readability.
    public void divideType02(int a, int b) throws FileNotFoundException, InterruptedException {
        System.out.println(a/b);  // Arithmetic Exception is a RuntimeException -> no need for any keyword for throwing exception upwards
        FileReader fileReader = new FileReader("some file name");
        // FileNotFoundException is a CompileTimeException -> using `throws` to propagate exception upwards is mandatory
        Thread.sleep(100);
    }


    public void chooseOperation(int operationType, int a, int b) throws FileNotFoundException, InterruptedException {
        if(operationType == 1){
            divide(a, b);
        } else if (operationType == 2){
            add(a,b);
        } else {
            throw new CalculatorException("Invalid operation type");
        }
    }
}

// Inside try block -> we put the code that can throw an exception
// Catch block -> try to add the possible exception that could be thrown inside the try block
// Catch block -> we put the code that can help us debug our exception easily
// try will always be present either with `catch` or `finally`


