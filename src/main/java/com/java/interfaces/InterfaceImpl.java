package com.java.interfaces;

public class InterfaceImpl {
    public static void main(String[] args) {
        //this is an exampe of annonymous inner call
        MyInterFace m = new MyInterFace() {
            @Override
            public void absractMethod() {
                System.out.println("this is an absract method");
            }
        };

        MyInterFace m1 = () -> System.out.println("null"); //this is using the concept of lambda expression
        //condition for lambda expression has to be functional interface

    }
}
