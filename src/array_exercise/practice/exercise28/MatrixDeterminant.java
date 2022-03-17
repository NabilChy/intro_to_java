package array_exercise.practice.exercise28;
// Calculates Determinant for a 3x3 matrix
public class MatrixDeterminant {
    public static void main(String[] args) {
        int[][] arr = {{1,0,-1}, {0,0,1}, {-1,-1,0}};
        System.out.println(GetDeterminant(arr));
    }

    public static int GetDeterminant(int[][] arr) {
        int i, j;
        int mul1 = 1;
        int mul2 = 1;
        int mul3 = 1, mul4 = 1 , mul5 = 1;
        for (int k = 0, m =0; k < arr.length; k++) {
            if(k == 0){
                for (i = 1; i < arr.length; i++){
                    for (j = 1; j < arr.length; j++){
                        if (i == j){
                            mul1 = mul1 * arr[i][j];
                        }else if (i+j == arr.length){
                            mul2 = mul2 * arr[i][j];
                        }
                    }
                }
                mul3 = arr[m][k] * (mul1 - mul2);
            } else if (k == 1){
                mul1 = arr[1][0] * arr[2][2];
                mul2 = arr[2][0] * arr[1][2];
                mul4 = arr[m][k] * (mul1 - mul2);
            } else if (k == 2){
                mul1 = arr[1][0] * arr[2][1];
                mul2 = arr[2][0] * arr[1][1];
                mul5 = arr[m][k] * (mul1 - mul2);
            }

        }
        return (mul3 - mul4 + mul5);
    }
}
