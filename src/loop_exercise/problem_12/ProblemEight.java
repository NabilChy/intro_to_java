package loop_exercise.problem_12;

public class ProblemEight {
    public static void main(String[] args) {
        int n = 5;
        int i, j, k;

        for(i = 1; i <= n; i++){
            for(j = i;  j < n; j++){
                System.out.print(" ");
            }
            for(k = 1; k <=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
