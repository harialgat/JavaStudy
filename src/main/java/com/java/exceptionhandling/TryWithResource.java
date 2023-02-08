package com.java.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) throws RuntimeException {
        //this demo is for try with resource
        try (FileReader fr = new FileReader("paht")) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
