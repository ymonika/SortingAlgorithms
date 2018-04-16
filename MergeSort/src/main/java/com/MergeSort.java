package com;

import java.util.Arrays;

public class MergeSort {

    static Integer[] array = {5, 1, 6, 2, 4, 3};
    static Integer[] tempMergArr = new Integer[array.length];

    public static void mergeSort(int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(l, mid);
            mergeSort(mid + 1, r);
            mergeParts(l, mid, r);
        }

    }

    static private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }

    public static void main(String[] args) {
        mergeSort(0, array.length-1);
        Arrays.stream(array).forEach(System.out::println);
    }
}
