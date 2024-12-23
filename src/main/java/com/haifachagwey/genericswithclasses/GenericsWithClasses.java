package com.haifachagwey.genericswithclasses;

import java.util.Date;

public class GenericsWithClasses {

    public static void main(String[] args) {

        Box box = new Box();
        box.set("1");
        box.set(new Date());

//        Enforce the type that goes inside this box
        Box<Phone> box2 = new Box<>();
//      A box of phone
        box2.set(new Phone("Samsung"));
        System.out.println(box2.get());

//      A box of letter
        Box<Letter> box3 = new Box<>();
        box3.set(new Letter("Eric"));
        System.out.println(box3.get());
    }

}
