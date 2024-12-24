package com.haifachagwey.boundedtypeparameter;

public class BoundedTypeParameter {

    public static void main(String[] args) {
//        An array of integers
        Integer[] numbers = {1, 2, 3};
//        An array of doubles
        Double[] numbers2 = {1.0, 2.0, 3.0};
        System.out.println(countGreaterThan(numbers, 0));
        System.out.println(countGreaterThan(numbers2, 0.0));
    }

//    static int countGreaterThan(int[] numbers, int number) {
//        int count = 0;
//        for (int n : numbers) {
//            if (n > number) {
//                count++;
//            }
//        }
//        return count;
//    }
//    => The countGreaterThan method should work with any type of array
//    => It should be generic

//    static <T> int countGreaterThan(T[] numbers, T number) {
//        int count = 0;
//        for (T n : numbers) {
//            if (n > number) {
//                count++;
//            }
//            Operator '>' cannot be applied to 'T', 'T[]'
//        }
//        return count;
//    }
//    => Error: Operator '>' cannot be applied to 'T'
//    => The countGreaterThan function should work only with arrays of type integer and double

    interface A {}
    interface B {}

//    The type of array should implement the Comparable interface

//    Multiple Bounds:
//    static <T extends Comparable<T> & A & B> int countGreaterThan(T[] numbers, T number) {
    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }

//    T extends Bounder
//    If the Bounder is a class:
//        If T is a class => T should extend Bounder
//        If T is an interface => nothing
//    If the Bounder is an interface:
//        If T is a class => T should implement Bounder
//        If T is an interface => T should extend Bounder

//    T extends Comparable
//    The "extend" keyword represents "is-a" relationship
//    The inheritance and interface implementation satisfy the "is-a" relationship.
//    Comparable is an interface
//    Integer and Double implements Comparable interface, they do not extend it

}
