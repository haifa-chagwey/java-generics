package com.haifachagwey.genericswithmethods;

public class Example {

    public static void main(String[] args) {
//        String[] names = {"Ali", "Jamila"};
////      We have to use Object version of primitive types (Integer(int), Character (char), Double (double)) with Generics
//        char[] letters = {'A', 'B', 'C'};
//        print(names);
//        print(letters);
//                  -----------
        String[] names = {"Ali", "Jamila"};
        Character[] letters = {'A', 'B', 'C'};
        Integer[] numbers = {1, 2, 3};
        print(names);
        print(letters);
        print(numbers);
    }
//    static void print(String[] array) {
//        for (String e : array) {
//            System.out.println(e.getClass().getName() + " - " + e);
//        }
//    }
//                  -----------
    static void print(Object[] array) {
        for (Object e : array) {
            System.out.println(e.getClass().getName() + " - " + e);
        }
    }
//                  -----------
//    static <T> void print(T[] array) {
////        Works with any datatype
//        for (T e : array) {
//            System.out.println(e.getClass().getName() + " - " + e);
//        }
//    }
}
