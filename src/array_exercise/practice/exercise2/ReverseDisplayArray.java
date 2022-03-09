package array_exercise.practice.exercise2;

import java.util.Scanner;

public class ReverseDisplayArray {
    public static void main(String[] args) {
        DisplayReverseArray(3);
    }

    public static void DisplayReverseArray(int value){
        int[] arr = new int[value];
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter elements of array: ");

        for(int i = 0; i < value; i++){
            int j = myObj.nextInt();
            arr[i] = j;
        }

        for( int i = value - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
