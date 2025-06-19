package oops01;

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

        // 03 - Copy Constructor ::
        Iphone iphone13 = new Iphone(13, 13, 50000, "Iphone", "Apple", 6, 4, 3500);
        System.out.println("Iphone data: " + iphone13);  // prints address of the object
        System.out.println("Iphone13 data: " + iphone13.price);  // access elements of the object

        Iphone iphone14 = new Iphone(iphone13);
        System.out.println("Iphone14 data: " + iphone14.price);
        Iphone iphone15 = new Iphone(iphone14);
        System.out.println("Iphone15 data: " + iphone15.price);


        // DEEP and SHALLOW copy ::
        Student std = new Student(12, "Anand");
        Student std1 = std;  // This is a Shallow copy
        // Shallow copy has a new reference variable, but not a new object
        System.out.println("std: " + std);
        System.out.println("std1: " + std1);

        Student std2 = new Student(std);  // This is a Deep copy
        // Deep copy has a new reference variable, and also a new object
        System.out.println("std2: " + std2);


        /*
         Points to remember :
         01 - Java is a "PASS BY VALUE" language.
         02 - The value we pass is a "double" and it holds the memory address of that object.
         03 - Whenever you make a class, make all its attributes as private and then
              create public getters and setters.
         */
    }
}
