package loop_exercise.problem_13;

public class ProblemNine {
    public static void main(String[] args) {
        int n = 5;
        int i, j, k;

        for (i = n; i >= 1; i--){
            for(j = i; j < n; j++){
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
