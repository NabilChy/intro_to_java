package array_exercise.practice.exercise21;
//Multiply two matrix of same size with row = column
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {3,4}};
        int[][] arr1 = {{5,6}, {7,8}};

        int[][] arr2 = GetMultiplyMatrix(arr, arr1);
        System.out.println("Result:");
        for(int i=0; i < arr2.length; i++){
            for (int j = 0; j < arr2.length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] GetMultiplyMatrix(int[][] arr, int[][] arr1){
        int i, j;
        int[][] arr2 = new int[arr.length][arr.length];


        for(i = 0; i < arr2.length; i++){
            for(j = 0; j < arr2.length; j++){
                int sum = 0;
                for (int k = 0; k < arr2.length; k++){
                    sum = sum + (arr[i][k] * arr1[k][j]);
                    arr2[i][j] = sum;
                }

            }
        }
        return arr2;
    }
}
