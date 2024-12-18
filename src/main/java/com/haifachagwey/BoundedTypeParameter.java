package com.haifachagwey;

public class BoundedTypeParameter {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        Double[] numbers2 = {1.0, 2.0, 3.0};
        System.out.println(
                countGreaterThan(numbers, 0)
        );
    }

    // Our method should work with integers and numbers
    // It should be Generic
//    static <T> int countGreaterThan(T[] numbers,
//                                T number) {
//        int count = 0;
//        for (T n : numbers) {
//            if (n > numbers) {
//                count++;
//            }
//            Operator '>' cannot be applied to 'T', 'T[]'
//        }
//        return count;
//    }


    interface A {}
    interface B {}

//    In Java generics, the keyword "extends" is used universally for both:
//    Classes: To specify that a type must inherit from a class.
//    Interfaces: To specify that a type must implement an interface
//    Both inheritance (via extends) and interface implementation satisfy the "is-a" relationship.


    static <T extends Comparable<T>> int countGreaterThan(T[] numbers,
                                                          T number) {
//      T extends Comparable
//        The "extends" keyword means that T should either extend the Comparable interface or implements it
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}
