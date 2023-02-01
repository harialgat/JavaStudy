package com.java.interfaces;

//an interface can extend as many interfaces as we want
@FunctionalInterface
public interface MyInterFace extends IF1 {
    void absractMethod();
}

interface IF1 {
    default void myMethod() {
        System.out.println("Hi Harish");
    }
}



