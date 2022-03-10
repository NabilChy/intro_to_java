package array_exercise.practice.exercise4;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {15,10,12};
        int[] arr1 = new int[arr.length];
        GetArrayCopy(arr, arr1);

        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] +" ");
        }
    }

    public static void GetArrayCopy(int[] arr, int[] arr1){
        for(int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
    }
}
