package loop_exercise.problem_15;

public class ProblemEleven {
    public static void main(String[] args) {
        int n = 5;
        int i, j, k;

        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                System.out.print(j + " ");

                if(j == n){
                    System.out.println();
                    for(k = n - 1; k >= 1; k--){
                        for(int l = 1; l <= k; l++){
                            System.out.print(l + " ");
                        }
                        System.out.println();
                    }
                }
            }
            System.out.println();
        }

    }
}
