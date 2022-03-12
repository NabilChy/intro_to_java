package array_exercise.practice.exercise24;

public class LeftDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {3,4}};
        System.out.println(GetSumDiagonalLeft(arr));

    }

    public static int GetSumDiagonalLeft(int[][] arr){
        int sum = 0;
        int i, j;
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr.length; j++){
                if (i == j){
                    sum = sum + arr[i][j];
                }
            }
        }
        return sum;
    }
}
