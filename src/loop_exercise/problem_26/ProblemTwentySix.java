package loop_exercise.problem_26;

public class ProblemTwentySix {
    public static void main(String[] args) {
        int n = 4;

        int i, j;
        for(i = 0; i <= n; i++){
            for(j = 65; j <= i + 65; j++){
                char a = (char)j;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
