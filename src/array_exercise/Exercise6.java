package array_exercise;

import static java.lang.Math.abs;
//Checks if an array is sorted or not. sorted = true, unsorted = false
public class Exercise6 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1 = new int[]{10,5,11,3,7,14,13};
        int[] arr2 = {10,9,8,7,6,5,4,3,2,1};
        System.out.println("The array is sorted: " + isSorted(arr) +".");
        System.out.println("The array is sorted: " + isSorted(arr1) +".");
        System.out.println("The array is sorted: " + isSorted(arr2) +".");

    }

    public static boolean isSorted(int[] arr){
        int i, count = 0;
        for(i = 0; i < arr.length - 1; i++){
            if(arr[i+1] > arr[i]){
                //Ascending
                count++;

            }else if(arr[i+1] < arr[i]){
                //Descending
                count--;

            }
            if (abs(count) == arr.length - 1){
                return true;
            }
        }
        return false;
    }
}


//a ={1,2,3,4,5}
/*
count = 0
i = 0
i+1 = 1
2 > 1
count =  1
i = 1
i+1 = 2
3 > 2
count = 2
i = 2
i +1 = 3
4 > 3
count = 3
i = 3
i + 1 = 4
5 > 4
count = 4

 */