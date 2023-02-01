package com.ds.lineards.searching.binarysearch;

public class BinarySearch {
    public boolean searchElement(int []array,int key) {
     int low =  0;
     int high =  array.length-1;

     while(high>=low){
         int mid = (low+high)/2 ;
         if(array[mid]==key){
             return true;
         }else if(key>array[mid]){
             low = mid+1;
         }else {
             high = mid-1;
         }
     }
     return false;
    }

    public static void main(String[] args) {
        BinarySearch bS =  new BinarySearch();
        int [] arr = {20,30,40,43,50};
        System.out.println(bS.searchElement(arr,50));
        System.out.println(bS.searchElement(arr,0));
    }
}
