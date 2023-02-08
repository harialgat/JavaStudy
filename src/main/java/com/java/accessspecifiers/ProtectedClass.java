package com.java.accessspecifiers;

public class ProtectedClass {
    //Access wrt to two things
    //1.when you create Objetc and try to access
    //in this case within the same package the method will be visible if object is created

    //2.when you extend the class to some other class
    //in this case everytime the method will be accessible

    protected int myMethod() {
        System.out.println("this is a protected method");
        return 0;
    }
}
