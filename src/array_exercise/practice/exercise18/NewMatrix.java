package array_exercise.practice.exercise18;

import java.util.Scanner;

public class NewMatrix {
    public static void main(String[] args) {
        int[][] arr = CreateNewMatrix(3);
        System.out.println("The matrix is: ");
        for(int i=0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static int[][] CreateNewMatrix(int size) {
        int[][] arr = new int[size][size];
        Scanner myObj = new Scanner(System.in);
        int i,j;
        System.out.println("Please enter array elements: ");
        for(i=0; i < size; i++){
            for (j = 0; j < size; j++){
                int k = myObj.nextInt();
                arr[i][j] = k;
            }
        }
        return arr;
    }
}
