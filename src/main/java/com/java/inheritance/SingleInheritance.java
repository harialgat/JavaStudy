package com.java.inheritance;

public class SingleInheritance extends Parent {
    public SingleInheritance(int num) {
        super(num);
    }

    public static void main(String[] args) {
        SingleInheritance s = new SingleInheritance(10);
        System.out.println(s.getStudentId());

        //dynamic polymorphism
        Parent p  =  new SingleInheritance(12);
        System.out.println(p.getStudentId());
    }

    @Override
    public int getStudentId() {
        return studentId + 100;
    }
}

class Parent {
    public int studentId;

    public Parent(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}