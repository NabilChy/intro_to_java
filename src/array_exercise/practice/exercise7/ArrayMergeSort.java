package array_exercise.practice.exercise7;

import testfunction.patternfunctions.PatternPrint;

public class ArrayMergeSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr1 = {1,2,3};
        int[] arr2 = MergeArray(arr, arr1);
        int[] arr3 = SortDescendingArray(arr2);

        for (int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }
    }

    public static int[] MergeArray(int[] arr, int[] arr1){
        int[] arr2 = new int[arr.length + arr1.length];
        int i;
        int offset = 0;

        for (i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
            offset++;
        }

        for (i = 0; i < arr1.length; i++){
            arr2[offset + i] = arr1[i];
        }
        return arr2;
    }

    public static int[] SortDescendingArray(int[] arr){
        int i, j;
        for (i = 0; i < arr.length; i++){
            for (j = i + 1; j < arr.length; j++){
                if (arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

