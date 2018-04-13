package com;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[min_index]) {
                 min_index = j;
                }
            }
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Integer[] array = {5, 1, 6, 2, 4, 3};
        selectionSort(array);
    }
}
