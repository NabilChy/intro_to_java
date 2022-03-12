package array_exercise.practice.exercise23;

public class RightDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {3,4}};
        System.out.println(GetSumDiagonalRight(arr));

    }

    public static int GetSumDiagonalRight(int[][] arr){
        int sum = 0;
        int i, j;
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr.length; j++){
                if (i+j == arr.length - 1){
                    sum = sum + arr[i][j];
                }
            }
        }
        return sum;
    }
}
