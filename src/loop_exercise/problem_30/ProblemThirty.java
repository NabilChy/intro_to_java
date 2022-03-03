package loop_exercise.problem_30;

public class ProblemThirty {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        for (i = 1; i <= n; i++){
            for (j = 1; j <= n; j++){
                if (j == 1 || j == n || i == 1 || i == n){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
