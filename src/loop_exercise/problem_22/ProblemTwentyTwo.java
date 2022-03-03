package loop_exercise.problem_22;

public class ProblemTwentyTwo {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        int i , j, k;

        for(i = 1; i <= n; i++){
            for(j = i; j < n; j++){
                System.out.print("  ");
            }

            for(k = 1; k <= m ; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
            m = m + 2;
        }
    }
}
