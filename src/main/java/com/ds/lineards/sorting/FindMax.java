package com.ds.lineards.sorting;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {1023, 3232, 322324, 3132132, 23123, 133223};
        FindMax f = new FindMax();
        System.out.println(f.findMax(arr, 1));
    }

    /**
     * @param array: input data
     * @param n      : 1st,2nd,3rd..nth
     * @return
     */

    public int findMax(int[] array, int n) {
        int max = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }

        }
        return max;
    }
}
