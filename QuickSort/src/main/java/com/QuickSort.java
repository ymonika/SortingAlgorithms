package com;

public class QuickSort {

    static int[] array = {5, 1, 6, 2, 4, 3};
    static int length = array.length;

    public static void quickSort(int l, int r) {
        int i = l, j = r;
        int pivot = array[l + ((r - l) / 2)];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        if (l < j) {
            quickSort(l, j);
        }
        if (i < r) {
            quickSort(i, r);
        }
    }

    public static void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        quickSort(0, length - 1);
        for (int i = 0; i < length; i++)
            System.out.println(array[i]);
    }
}
