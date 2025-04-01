package com.netik.SpringFrameworkExercise;

import com.kohli.springexercise.answer2.BinarySearch;
import com.kohli.springexercise.sortalgorithms.SelectionSort;


public class Answer2 {
    public static void main(String[] args) {
        int[] arr = {5,7,3,1,8,6,2};
        BinarySearch binarySearch = new BinarySearch(new SelectionSort());
        int output = binarySearch.binarySearch(arr, 0, arr.length, 5);
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("Index of target Value: " + output);
    }
}
