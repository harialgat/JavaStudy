package com.ds.lineards.queues;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Queue {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.class.path"));
        getEvenSortedArray(new int[]{102, 1, 324, 3132, 32432});

    }

    public static void getEvenSortedArray(int[] array) {
        List<Integer> evenArray = new ArrayList<>();
        for (int a : array) {
            if (a % 2 == 0) {
                evenArray.add(a);
            }
        }
        // Collections.sort(evenArray);
        int[] ev = new int[evenArray.size()];
        for (int i = 0; i < evenArray.size(); i++) {
            ev[i] = evenArray.get(i);
        }
        for (int i = 0; i < ev.length - 1; i++) {
            for (int j = 0; j < ev.length - i - 1; j++) {
                if (ev[j] > ev[j + 1]) {
                    int temp = ev[j];
                    ev[j] = ev[j + 1];
                    ev[j + 1] = temp;
                }
            }
        }
        for (int a : ev) {
            System.out.println(a);
        }
    }
}
