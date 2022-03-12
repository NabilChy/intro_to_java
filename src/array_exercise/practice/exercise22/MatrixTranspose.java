package array_exercise.practice.exercise22;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        int[][] arr1 = GetTranspose(arr);
        System.out.println("Result:");
        int row = arr1.length;
        int column = arr1[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] GetTranspose(int[][] arr) {
        int i, j, k, row, column;
        row = arr.length;
        column = arr[0].length;
        int[][] arr1 = new int[column][row];
        for (i = 0; i < column; i++) {
            for (j = 0; j < row; j++) {
                arr1[i][j] = arr[j][i];
            }
        }
        return arr1;
    }
}
