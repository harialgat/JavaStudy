package com.java.objectclass;

public class Test {
    private int testData;
    private int myData;


    public Test(int testData, int myData) {
        this.testData = testData;
        this.myData = myData;
    }

    public static void main(String[] args) {
        Test t = new Test(10, 20);
        System.out.println(t); //this will internally call the toString() method of object class if not overriden, if overriden
        Test t1 = t;

        //hashcode
        //if both the objects are same the hashcode return are same
        //32 bit int number will be return
        System.out.println(t.hashCode());
        System.out.println(t1.hashCode());


        // equals method will check if the values are same

        if(t1.equals(t)){
            System.out.println("both objects are same");
        }
    }

    public int getTestData() {
        return testData;
    }

    public void setTestData(int testData) {
        this.testData = testData;
    }

    public int getMyData() {
        return myData;
    }

    public void setMyData(int myData) {
        this.myData = myData;
    }


    //this method is from the object class
    // generally this method gets invoked once you just call the object instance

    @Override
    public String toString() {
        return "testData " + testData + " myData " + myData;
    }
}
