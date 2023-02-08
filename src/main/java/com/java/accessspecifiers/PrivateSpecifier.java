package com.java.accessspecifiers;

//if you make anything private that cannot be accessed outside of any other class
//not in inheritance no where it is accessible

//scope : same class
public class PrivateSpecifier {
    /**
     * if the constructor of the class is made private then object can only be made within the same class
     */
    private PrivateSpecifier(int i) {

    }

    public PrivateSpecifier() {

    }

    //this is a private method and it cannot be accessed outside of this class
    private int method() {
        System.out.println("data");
        return 0;
    }
}

class Test {
    public static void main(String[] args) {
        PrivateSpecifier p = new PrivateSpecifier();

        //private methods cannot be accessed outside the main classs

    }
}
