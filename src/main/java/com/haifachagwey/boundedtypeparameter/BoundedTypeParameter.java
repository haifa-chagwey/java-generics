package com.haifachagwey.boundedtypeparameter;

public class BoundedTypeParameter {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        Double[] numbers2 = {1.0, 2.0, 3.0};
        System.out.println(countGreaterThan(numbers, 0));
        System.out.println(countGreaterThan(numbers2, 0.0));
    }

//    Our method should work with integers and numbers
//    It should be Generic
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

    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}
