package com.java.inheritance;

public class MultiLevelInheritance extends A {
    public String mainChildClass;

    public MultiLevelInheritance(String A, String B, String C) {
        super(A, B);
        this.mainChildClass = C;
    }
}

class A extends B {
    public String A;

    public A(String A, String B) {
        super(B);
        this.A = A;
    }

    public A(String B) {
        super(B);

        //super(B);
    }
}

class B {
    public String classB;

    public B(String classB) {
        this.classB = classB;
    }

    public void parentOfAll() {
        System.out.println("class B is the parent class of all classes ");
    }
}