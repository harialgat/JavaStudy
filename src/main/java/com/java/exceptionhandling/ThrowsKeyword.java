package com.java.exceptionhandling;

import java.lang.reflect.Method;

//let the exception propogate
public class ThrowsKeyword {
    //below is an example of class which
    public void loadClass(String classToLoad) throws ClassNotFoundException{
        Method [] methods = Class.forName(classToLoad).getMethods();
    }
}
