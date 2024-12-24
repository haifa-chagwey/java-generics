package com.haifachagwey.genericswithmethods;


public class Example {

    public static void main(String[] args) {

//        String[] names = {"Ali", "Jamila"};
//        char[] letters = {'A', 'B', 'C'};
//        print(names);
//        print(letters);
//                  -----------

        String[] names = {"Ali", "Jamila"};
//      When using generics, we have to use the of object version (or wrapper class) of primitive types (Integer(int), Character (char), Double (double))
        Character[] letters = {'A', 'B', 'C'};
        Integer[] numbers = {1, 2, 3};
//        int[] numbers = {1, 2, 3};
        Person[] people = { new Person("Ali"), new Person("Jamila") };
        print(names);
        print(letters);
        print(numbers);
        print(people);
    }
//    static void print(String[] array) {
//        for (String e : array) {
//            System.out.println(e.getClass().getName() + " - " + e);
//        }
//    }
//        => The print function should work with any type of arrays
//                  ----------

//    ***** Using Object class *****
//   Array of objects
//    static void print(Object[] array) {
//        for (Object e : array) {
//            System.out.println(e.getClass().getName() + " - " + e);
//        }
//    }

//    ***** Using Generics: *****
    static <T> void print(T[] array) {
        for (T e : array) {
            System.out.println(e.getClass().getName() + " - " + e);
        }
    }
}
