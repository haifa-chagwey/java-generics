package com.haifachagwey;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
//        Without using Generics:
//        List numbers = new ArrayList();
//        numbers.add(1);
//        numbers.add("2");
//        for (Object number : numbers) {
//            // We got a ClassCastException at runtime: we can't cast an integer to a string
//            System.out.println((String) number);
//        }
//        We should get this error in compile time not in runtime
//        Generics prevent errors from happening in runtime

//        Using Generics:
        List<Integer> numbers = new ArrayList();
        numbers.add(1);
        for (Integer number : numbers) {
            // We got a ClassCastException at runtime: we can't cast an integer to a string
            System.out.println(number);
        }

    }
}