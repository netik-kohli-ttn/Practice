package com.netik.SpringFrameworkExercise.answer3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InsertionSort implements SortAlgorithm {
   public void sort(int[] arr){
      for (int i = 1; i < arr.length; i++) {
         int key = arr[i];
         int j = i - 1;

         while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
         }
         arr[j + 1] = key;
      }
   }
}
