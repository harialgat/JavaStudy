package com.java.finalkeyword;

public class FinalClass {
    public static void main(String[] args) {
        FinalClassEx ex = new FinalClassEx(10);
        System.out.println(ex.getIntField());
    }
}
//final class can't be extended: inheritance is not possible

final class FinalClassEx {
    private  int intField;

    public FinalClassEx(int intField) {
        this.intField = intField;
    }

    public int getIntField() {
        return intField;
    }
}