package array_exercise.practice.exercise1;

import java.util.Scanner;

public class ArrayCreate {
    public static void main(String[] args) {
        CreateArray(10);
    }

    public static void CreateArray(int value){
        int[] arr = new int[value];

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the elements: ");

        for (int i = 0; i < value; i++){
            int a = myObj.nextInt();
            arr[i] = a;

        }

        for (int i = 0; i < value; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
