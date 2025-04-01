package com.kohli.springexercise.answer2;

public class BinarySearch {

    InsertionSort insertionSort = new InsertionSort();

    public int binarySearch(int arr[], int low, int high, int targetValue) {
        insertionSort.sort(arr);
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == targetValue)
                return mid;
            else if (arr[mid] < targetValue)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
