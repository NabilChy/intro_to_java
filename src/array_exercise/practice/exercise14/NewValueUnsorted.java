package array_exercise.practice.exercise14;

public class NewValueUnsorted {
    public static void main(String[] args) {
        int[] arr = {1,8,7,10};
        System.out.println("Old array:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = InsertValue(arr,5,2);
        System.out.println("New array:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] InsertValue(int[] arr, int value, int pos){
        int i;
        int[] arr1 = new int[arr.length + 1];

        for(i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
        arr1[arr1.length - 1] = 0;

        for(i = arr1.length - 1; i >= pos; i--){
            arr1[i] = arr[i-1];
        }
        arr1[pos -1] = value;


        /*
        // Move everything to right of pos by 1 DID NOT WORK
        for(i = arr.length + 1; i >= pos; i--){
            arr[i - 1] = arr[i-2];
            arr[pos] = value;
            System.out.println(arr[i]);
        }
         */

        return arr1;
    }
}
