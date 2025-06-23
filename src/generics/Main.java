package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator<Integer, Integer> intCalculator = new Calculator<>(2, 3);
            intCalculator.print(2,3);

        Calculator<Integer, Integer> intCalculator2 = new Calculator<>(5, 8);
        intCalculator2.printX(5);

        Calculator<Integer, String> intStrCalculator = new Calculator<>(17, "Hrishi");
        intStrCalculator.print(17, "Hrishi");

        /*
        // A raw type is when you use a generic class without specifying type parameters, like this:
        Calculator rawCal = new Calculator(true, true); // ✅ This is RAW type
        rawCal.print(true,true);
         */


        // Examples of Generic Classes :::
        // HashMap<String, Student> studentMap = new HashMap<>();
        // Set<String> stringSet = new HashSet<>();
        // List<Student> students = new ArrayList<>();


         // ClassName objName = new ClassName();
         // ---> new ClassName(); -- supported for generics -- NOT RECOMMENDED
         // ---> new ClassName<>(); -- supported for generics --- RECOMMENDED


        /*
         WRAPPER CLASSES ::: primitive variables inside a class
         Integer -- int
         Boolean -- boolean
         Double -- double -----> wrapper classes
         Generics only support objects -> Object class
         Generics don't support primitive variables, it only supports object as it built on top of object class
         We need to use wrapper classes for primitive variables

         Integer i = 10;
         int x = i;

         int y = 10;
         Integer z = y;
         AUTO-BOXING -> automatically converting wrapper class object to primitive and vice-versa
         */

        Animal animal = new Animal();  // normal object creation
        Dog dog = new Dog();   // normal object creation
        print(animal);  // output :: "Hello from Animal"
        print(dog);   // output :: "Hello from Dog"

        /*
        Animal animal2 = new Dog();  // UPCASTING --> works fine
        Dog dog2 = new Animal();   // DOWNCASTING --> doesn't work and not allowed in java
         */

        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Animal());
        animalsList.add(new Animal());

        List<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog());
        dogsList.add(new Dog());
        dogsList.add(new Dog());

        printList(animalsList);
        // printList(dogsList); // upcasting inside generics does not work

        Printer printer = new Printer();
        printer.print(animal);
        printer.print(dog);

    }

    public static void print(Animal animal) {
        animal.print();
    }

    public static void printList(List<Animal> list){
        System.out.println("Printing from list method ::: ");
        for(int i=0;i<list.size();i++){
            list.get(i).print();
        }
    }
    /*
    The same can be achieved by using Wildcards ::
    public static void printList(List<? extends Animal> list) {
    for(int i=0;i<list.size();i++){
            list.get(i).print();
        }
    }
     */
}

/*
Few examples of using Wildcards :::

List<?> allList = new ArrayList<>(); // wildcard list
List<? extends Animal> animalAndChildrenList = new ArrayList<>();
List<? super Animal> animalAndParentList = new ArrayList<>();
List<Animal> animalList = new ArrayList<>();
HashMap<Integer, Animal> animalMap = new HashMap<>();
 */


/*
    Animal
    Dog

    Animal is parent of Animal --- NO
    List is parent of List --- NO
    List<Animal> is at the same level as List<Dog> because both are nothing but lists
    so, List<Animal> is not parent of List<Dog>


    In Java:
    List<Dog> is not a subtype of List<Animal>
    Even though Dog is a subtype of Animal

    This is called invariance.

     Why Java chose invariance?
    To preserve type safety. Here's an example to show why this is necessary:

    List<Dog> dogs = new ArrayList<>();
    List<Animal> animals = dogs;  // Let's say this was allowed

    animals.add(new Cat());       // Valid from List<Animal>'s perspective

    Dog d = dogs.get(0);          // Now you get a Cat from a List<Dog>!
    This breaks the program at runtime. But Java's type system is designed to fail early at compile time,
    so this assignment is not allowed at all.

 */
