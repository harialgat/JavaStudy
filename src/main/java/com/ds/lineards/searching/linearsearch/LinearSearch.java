package com.ds.lineards.searching.linearsearch;

public class LinearSearch {
    public boolean search(String[] array, String key) {
        boolean flag = false;
        for (String s : array) {
            if (s.equals(key)) {
                flag = true;
                break;
            }

        }
        return flag;
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        System.out.println(ls.search(new String[]{"harish","nikita"},"harish"));
    }
}
