package generics;

public class Calculator <X,Y>{
    private X x;
    private Y y;

    // Constructor ::
    public Calculator(X x, Y y){
        this.x = x;
        this.y = y;
    }

    public X print(X x, Y y){  //generic method
        System.out.println("x is :: " + x);
        System.out.println("y is :: " + y);
        return x;
    }

    public void printX(X x){  // generic method
        System.out.println("printX is :: " + x);
    }

    public void printY(Y y){  // generic method
        System.out.println(y);
    }
}
