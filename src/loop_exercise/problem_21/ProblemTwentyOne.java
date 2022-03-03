package loop_exercise.problem_21;

public class ProblemTwentyOne {
    public static void main(String[] args) {
        int n = 3;
        int i, j ,k ;

        for(i = 1; i <= n; i++){
            for(j = i; j < n; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for(i = n - 1; i >= 1; i--){
            for(j = i; j <= n - 1; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}

