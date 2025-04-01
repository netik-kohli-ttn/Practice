package com.kohli.springexercise;

import com.kohli.springexercise.answer3.BinarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Answer3 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Answer3.class, args);

        BinarySearch binarySearch = context.getBean(BinarySearch.class);
        int[] arr = {5,7,3,1,8,9,2};
        int output = binarySearch.binarySearch(arr, 0, arr.length, 5);
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("Index of target Value: " + output);
    }
}
