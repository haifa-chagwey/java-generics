package com.haifachagwey.wildcards;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {
    //    ? Wildcards => unknown type
    public static void main(String[] args) {
//        List<Object> list1 = Arrays.asList("11", 2, new Date());
//        List of Integer
        List<Integer> list2 = Arrays.asList(1, 2, 3);
//        List of Double
        List<Double> list3 = Arrays.asList(1.0, 2.0, 3.0);
        printNumbers(list2);
        printNumbers(list3);
//        => Error
    }

//    static void print(List<Object> list) {
//        list.forEach(System.out::println);
//    }
//    => This function does not work for Integers and Doubles
//    => We have to use generics
//    static void print(List<?> list) {
//        list.forEach(e -> {
//                    System.out.println(e.getClass().getName());
//                    System.out.println(e);
//                }
//        );
//    }
//    => Our method should work with Integers and Doubles
//    Being restricted about the type that goes inside the print function

//    ***** Lower Bounded Wildcards *****
//    static void printNumbers(List<? super Number> list) {
//    ***** Upper Bounded Wildcards *****
    static void printNumbers(List<? extends Number> list) {
        list.forEach(e -> {
                System.out.println(e.getClass().getName());
                System.out.println(e);
            }
        );
    }

//   ***** Wildcards vs Type Parameters *****
//    Wildcards can only have one bound
//    Bounded Type Parameters do not have upper or lower bounds
//    Bounded Type Parameters allows us to capture the parameter that goes inside the method
}
