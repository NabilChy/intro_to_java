package array_exercise.practice.exercise11;

import testfunction.patternfunctions.PatternPrint;

public class ArraySortAscending {
    public static void main(String[] args) {
        int[] arr = {2,7,4,5,9};
        int[] arrAsc = GetSortAsc(arr);
        System.out.println("The elements in ascending order: ");
        for (int i = 0; i < arrAsc.length; i++){
            System.out.println(arrAsc[i]);
        }
    }

    public static int[] GetSortAsc(int[] arr){
        int i, j, temp;
        for (i = 0; i < arr.length; i++){
            for (j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
