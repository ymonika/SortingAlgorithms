package com;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(Integer[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Integer[] array = {5, 1, 6, 2, 4, 3};
        bubbleSort(array);
    }
}
