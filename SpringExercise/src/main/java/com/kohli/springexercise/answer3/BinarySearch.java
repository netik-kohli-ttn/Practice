package com.kohli.springexercise.answer3;

import com.kohli.springexercise.sortalgorithms.SortAlgorithm;

public class BinarySearch {

    SortAlgorithm sortAlgorithm;
    public BinarySearch(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int arr[], int low, int high, int targetValue) {
        sortAlgorithm.sort(arr);
        while (low <= high) {
            int mid = (high + low) / 2;

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
