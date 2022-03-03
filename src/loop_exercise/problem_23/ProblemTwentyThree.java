package loop_exercise.problem_23;

public class ProblemTwentyThree {
    public static void main(String[] args) {
        int n = 5;
        int i, j ,k;

        for(i = n; i >= 1; i--){
            for(j = i; j < n; j++){
                System.out.print(" ");
            }
            for( k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(i = 2; i <= n; i++){
            for(j = i; j < n; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
