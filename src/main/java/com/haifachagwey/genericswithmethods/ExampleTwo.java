package com.haifachagwey.genericswithmethods;

// Custom class
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ExampleTwo {

    public static void main(String[] args) {
        // Custom class array
        Person[] people = {new Person("Ali"), new Person("Jamila")};

        // Printing arrays of different types
        print(people);
    }

    static <T> void print(T[] array) {
        for (T e : array) {
            System.out.println(e.getClass().getName() + " - " + e);
        }
    }
}
