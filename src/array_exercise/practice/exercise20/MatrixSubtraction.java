package array_exercise.practice.exercise20;
// Subtract two matrix of same size;
public class MatrixSubtraction {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2}, {3,4}};
        int[][] arr = {{5,6},{7,8}};
        System.out.println("Result:");
        int[][] arr2 = SubMatrix(arr,arr1);
        for(int i=0; i < arr2.length; i++){
            for (int j = 0; j < arr2.length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] SubMatrix(int[][] arr, int[][] arr1){
        int[][] arr2 = new int[arr.length][arr.length];
        int i,j;

        for(i=0; i < arr2.length; i++){
            for (j = 0; j < arr2.length; j++){

                arr2[i][j] = arr[i][j] - arr1[i][j];
            }
        }
        return arr2;
    }
}
