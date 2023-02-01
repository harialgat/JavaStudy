package com.ds.lineards.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int[] sortedArray = b.bubbleSort(new int[]{10, 21, 32, 21, 32});
        for (int a : sortedArray) {
            System.out.println(a);
        }
    }

    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
