package loop_exercise.problem_18;

public class ProblemSeventeen {
    public static void main(String[] args) {
        int n = 5;
        int i ,j ,k;

        for(i = 1; i <= n; i++){
            for( j = i; j < n; j++){
                System.out.print(" ");
            }
            for( k = 1; k <= i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
