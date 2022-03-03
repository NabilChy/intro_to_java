package loop_exercise.problem_25;

public class ProblemTwentyFive {
    public static void main(String[] args) {
        int n = 4;

        int i, j;
        for(i = n; i >= 0; i--){
            for(j = 65; j <= i + 65; j++){
                char a = (char)j;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
