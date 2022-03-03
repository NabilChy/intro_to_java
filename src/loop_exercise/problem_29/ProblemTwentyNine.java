package loop_exercise.problem_29;

public class ProblemTwentyNine {
    public static void main(String[] args) {
        int n = 5;
        int l = 0;
        int i, j;

        for(i = 1; i <= n; i++){
            for(j = 1; j < n; j++){
                l = l +1;
                System.out.print(l);

                if(l == 9){
                    l = -1;
                }
            }
            System.out.println();
        }
    }
}
