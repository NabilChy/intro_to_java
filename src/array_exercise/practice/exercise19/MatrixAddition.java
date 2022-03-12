package array_exercise.practice.exercise19;
// Adding two matrices of same size
public class MatrixAddition {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {3,4}};
        int[][] arr1 = {{5,6},{7,8}};
        System.out.println("Result:");
        int[][] arr2 = AddMatrix(arr,arr1);
        for(int i=0; i < arr2.length; i++){
            for (int j = 0; j < arr2[0].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] AddMatrix(int[][] arr, int[][] arr1){
        int[][] arr2 = new int[arr.length][arr[0].length];
        int i,j;

        for(i=0; i < arr2.length; i++){
            for (j = 0; j < arr2[0].length; j++){

                arr2[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        return arr2;
    }
}
