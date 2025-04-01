package com.kohli.springexercise.answer1;

public class BinarySearch {

    InsertionSort insertionSort = new InsertionSort();

    public int binarySearch(int arr[], int low, int high, int x) {
        insertionSort.sort(arr);
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return mid;
            else if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
