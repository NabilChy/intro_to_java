package array_exercise.practice.exercise25;

public class ArrayRowColumnSum {
    public static void main(String[] args) {
        int[][] arr = {{5,6}, {7,8}};
        int[][] arr1 = GetSumColumn(arr);
        int[][] arr2 = GetSumRow(arr);
        System.out.println("Sum of columns in order: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("Sum of rows in order: ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.println(arr2[i][j] + " ");
            }
        }

    }

    public static int[][] GetSumColumn(int[][] arr){
        int i, j;
        int[][] arr1 = new int[1][arr[0].length];

        for (i = 0; i < arr1.length; i++){
            for (j = 0; j < arr[0].length; j++){
                int sum = 0;
                for (int k = 0; k < arr.length; k++){
                    sum = sum + arr[k][j];
                    arr1[i][j] = sum;
                }
            }
        }
        return arr1;
    }

    public static int[][] GetSumRow(int[][] arr){
        int i, j;
        int[][] arr1 = new int[arr.length][1];

        for (i = 0; i < arr1.length; i++){
            for (j = 0; j < arr1[0].length; j++){
                int sum = 0;
                for (int k = 0; k < arr[0].length; k++){
                    sum = sum + arr[i][k];
                    arr1[i][j] = sum;
                }
            }
        }
        return arr1;
    }
}
