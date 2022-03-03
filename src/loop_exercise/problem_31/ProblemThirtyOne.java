package loop_exercise.problem_31;

public class ProblemThirtyOne {
    public static void main(String[] args) {
        int n = 5;
        int i, j;

        for (i = 1; i <= n; i++){
            for (j = 1; j <= n; j++){
                if(
                        i == 1 || i == n || (i%2 == 0 && j%2 == 0) ||
                                (i%2 != 0 && j%2 != 0)
                ){
                    System.out.print("- ");
                }else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }
}
