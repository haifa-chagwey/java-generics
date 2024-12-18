package com.haifachagwey;

public class GenericsWithClasses {

    public static void main(String[] args) {

        Box<Phone> box = new Box<>();
        box.set(new Phone("Samsung"));
        System.out.println(box.get());

        Box<Letter> box2 = new Box<>();
        box2.set(new Letter("Eric"));
        System.out.println(box2.get());
    }

}
