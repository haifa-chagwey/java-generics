package com.haifachagwey.classcastexception;

public class ExampleTwo {

    public static void main(String[] args) {
/*
          Comparable number = 10;
          number.compareTo("10");
*/
//        => We got a Class Cast Exception at runtime because we can't compare integer to a string
//        => We should get this error at compile time
//        => Use Generics to catch this error in compile time and not in runtime
//        Comparable of integer
        Comparable<Integer> number = 10;
//        We are comparing integers
        System.out.println(number.compareTo(10));
    }
}

/*
    Generics provide compile type checking
    => Reduce the ClassCastException and the explicit cast of objects

*/

