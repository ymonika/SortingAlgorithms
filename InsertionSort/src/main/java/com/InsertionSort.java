package com;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] a, int length) {
        int i, j, key;
        for(i=1; i<6; i++)
        {
            key = a[i];
            j = i-1;
            while(j>=0 && key < a[j])
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
       Arrays.stream(a).forEach(System.out::print);
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 6, 2, 4, 3};
        insertionSort(array, array.length);
    }
}
