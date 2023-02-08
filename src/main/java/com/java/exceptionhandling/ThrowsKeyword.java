package com.java.exceptionhandling;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

//let the exception propogate
public class ThrowsKeyword {
    //below is an example of class which
    //throw will let the exception to propogate

    public void loadClass(String classToLoad) throws ClassNotFoundException {
        Method[] methods = Class.forName(classToLoad).getMethods();
        Method m = methods[0];
        Type[] type = m.getGenericParameterTypes();
    }
}
