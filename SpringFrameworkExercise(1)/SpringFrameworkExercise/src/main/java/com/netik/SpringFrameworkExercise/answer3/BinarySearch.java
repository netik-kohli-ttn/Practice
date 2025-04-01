package com.netik.SpringFrameworkExercise.answer3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
    @Autowired
    SortAlgorithm sortAlgorithm;

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
