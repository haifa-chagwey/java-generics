package com.haifachagwey.genericswithclasses;

// public class Box<T, K> {
// public class Box<T extends Comparable<T>> {
public class Box<T> {

    private T t;
//    private K k;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }
}
