package com.java.basics;

public class Basics {

    private int baseId;
    private String baseName;

    public static void main(String[] str) {
        Basics b = new Basics(); //default constructor is called no parameterized constructor
        //since it's a main method it cannot access the non static elements of the class
        //control goes to JVM (java virtual machine)  it looks for main method
        //public  :  if it was private or protected it was no where accessible
        //static :  if it was non static you had to create an object and jvm cannot really create object for us
        //void : this method cannot return anything for us
        //protected : accessible with object within the same package
        System.out.println(b.baseId);
    }

    public int getBaseId() {
        return baseId;
    }

    public void setBaseId(int baseId) {
        this.baseId = baseId;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public String convertIntoString() {
        return String.valueOf(this.baseId);
    }

}
