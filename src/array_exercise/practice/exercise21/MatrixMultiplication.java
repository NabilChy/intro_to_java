package array_exercise.practice.exercise21;
//Multiply two matrix assuming multiplication is possible.
public class MatrixMultiplication {
    public static void main(String[] args) throws Exception {
        int[][] arr = {{1,2}, {3,4}, {1,1}};
        int[][] arr1 = {{5,6}, {7,8}, {1,1}};

        int[][] arr2 = GetMultiplyMatrix(arr, arr1);
        System.out.println("Result:");
        for(int i=0; i < arr2.length; i++){
            for (int j = 0; j < arr2[0].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] GetMultiplyMatrix(int[][] arr, int[][] arr1) throws Exception {
        int i, j;
        int r1 = arr.length;
        int r2 = arr1.length;
        int c1 = arr[0].length;
        int c2 =  arr[0].length;

        int[][] arr2 = new int[arr.length][arr[0].length];
        for(i = 0; i < arr2.length; i++){
            for(j = 0; j < arr2[0].length; j++){
                int sum = 0;
                for (int k = 0; k < arr2[0].length; k++){
                    sum = sum + (arr[i][k] * arr1[k][j]);
                    arr2[i][j] = sum;
                }

            }
        }
        return arr2;
    }
}
