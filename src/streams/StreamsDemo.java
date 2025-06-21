package streams;

import generics.Dog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*
            Stream is a type of data-structure.
            Stream can be generic or stream of primitives

            1. Use Stream<Generic> with generics, don't rely much on primitive streams
            2. Try using Collection data structure, rather than using primitive arrays
         */

        // 01. Different ways of Creating a Stream ::
        IntStream intStream = Arrays.stream(arr);   // stream of primitive
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> integerStream = list.stream();
        Stream<Integer> directIntStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Boolean> booleanStream = Stream.of(true, false, true);
        Stream<Dog> dogStream = Stream.of(new Dog(), new Dog(), new Dog());

        // 02. Practice problems ::

        // Q1. List of names, print all names starting with letter 'A'
        List<String> names = Arrays.asList("Alice", "Bob", "Alex", "Brian", "Anita");
        // Printing all names:
        for(String n : names) {   // picking up items from list "names" and putting it in variable n one by one
            System.out.println("Names are :: " + n);
        }
        System.out.println("--------Q1---------");
        // 01 - Using Streams:
        names.stream()
                .filter(n -> n.startsWith("A"))   // intermediate operation
                .forEach(n -> System.out.println("Names starting with A: " + n));  // terminal operation
        // The above can also be written as:
        names.stream()
                .filter(n -> n.startsWith("A"))   // intermediate operation
                .forEach(System.out::println);  // terminal operation

        System.out.println("-----------------");
        // Print all names which have length more than 4
        names.stream()
                .filter(n -> n.length() > 4)
                .forEach(n -> System.out.println("Names with more than 4 letters: " + n));
        // The above can also be written as:
        names.stream()
                .filter(n -> n.length() > 4)
                .forEach(System.out::println);  // shorter code with method reference because of single parameter

        System.out.println("--------Q2---------");
        // Q2. Convert a list of names to uppercase and store it new a new list
        List<String> lowerCaseNames = Arrays.asList("alice", "bob", "charlie", "darwin", "alicia", "jackie", "rockie", "wu", "xu");

        List<String> upperCaseNames = lowerCaseNames.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());   // It can also be written as ".toList();"
        System.out.println(upperCaseNames);
        System.out.println("-----------------");
        // make those names capital which have at least 4 letters in sorted order
        List<String> upperCase4Names = lowerCaseNames.stream()
                .filter(n -> n.length() > 4)  // intermediate operation 1
                .map(String::toUpperCase)  // intermediate operation 2
                .sorted()  // intermediate operation 3
                .collect(Collectors.toList());  // terminal operation
        System.out.println(upperCase4Names);

        System.out.println("--------Q3---------");
        // Given a list of numbers, find the sum of all even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfEven = numbers.stream()
                .filter(n -> n % 2 == 0)  // intermediate 1 -> chooses those numbers which are even
                .mapToInt(n -> n)  // converts stream into int, as it is [ 2(Stream) -> 2(Integer) ]
                .sum();  // terminal operation
        System.out.println("sumOfEven :: " + sumOfEven);
    }
}
