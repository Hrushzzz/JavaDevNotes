package oops;

public class Main {
    public static void main(String[] args) {

        //*** OOPS 01 - Constructors ::: ***

        // 01 - Default Constructor ::
        Student student01 = new Student();
        student01.id = 1;
        student01.name = "Hrishi";
        student01.school = "Nalanda Vidya Niketan";
        System.out.println("Student01 data: ");
        student01.print();

        // 02 - Parametrized Constructor ::
        Student student02 = new Student(17, "Koushik");
        System.out.println("Student02 data: ");
        student02.print();

        Student student03 = new Student(28);
        System.out.println("Student03 data: ");
        student03.print();
    }


}
