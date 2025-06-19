package generics;

public class Printer <P extends Animal>{

    public void print(P p) {
        System.out.println("Printing from Printer class ::: ");
        p.print();
    }
}
