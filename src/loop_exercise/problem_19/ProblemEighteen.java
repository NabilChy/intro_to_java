package loop_exercise.problem_19;

public class ProblemEighteen {
    public static void main(String[] args) {
        int n = 5;
        int i, j;
        for(i = n; i >= 1 ; i--){
            for(j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
