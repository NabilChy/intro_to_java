package array_exercise.practice.exercise26;

public class LowerTriangle {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,1},{4,5,6,1},{7,8,9,1},{10,11,12,1}};
        PrintLowerTriangle(arr);

    }

    public static void PrintLowerTriangle(int[][] arr){
        int i, j;

        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr[0].length; j++){
                if(i > j){
                    arr[i][j] = 0;
                }
            }
        }
        for (i = 0; i < arr.length; i++){
            for (j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
