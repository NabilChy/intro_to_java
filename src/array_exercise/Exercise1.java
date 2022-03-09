package array_exercise;

import java.security.KeyStore;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,8,9};
        System.out.println(ArrayExercise1(arr, 10));
        System.out.println(GetIndex(arr, 5));
    }

    public static boolean ArrayExercise1(int[] arr, int target){

        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static int GetIndex(int[] arr, int target){

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }


}
