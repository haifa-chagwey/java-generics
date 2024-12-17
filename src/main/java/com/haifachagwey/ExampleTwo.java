package com.haifachagwey;

public class ExampleTwo {

    public static void main(String[] args) {
//        Comparable number = 10;
//        number.compareTo("10");
//        => We got ClassCastException at runtime because we can't compare integer to a string

//        Use Generics to catch this error in compile time and not in runtime
        Comparable<Integer> number = 10;
        System.out.println(number.compareTo(10));
    }
}
