package com.haifachagwey.genericswithmethods;

import com.haifachagwey.genericswithclasses.Box;
import com.haifachagwey.genericswithclasses.Letter;
import com.haifachagwey.genericswithclasses.Phone;

public class ExampleTwo {

    public static void main(String[] args) {
        Box<Phone> box2 = new Box<>();
//      A box of phone
        box2.set(new Phone("Samsung"));
        print(box2);

//      A box of letter
        Box<Letter> box3 = new Box<>();
        box3.set(new Letter("Eric"));
        print(box3);
    }

//    The print function works with any type of box
    static <T> void print(Box<T> box) {
        System.out.println(box.get());
    }
}
