package loop_exercise.problem_14;

public class ProblemTen {
    public static void main(String[] args) {
        int n = 6;
        int i,j, k;

        for(i = 1; i <= n; i++){
            for(j = i; j < n; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print(k);
                if(k == 1){
                    ;
                }else if(k != 1 && k == i){
                    for(int l = 1; l < k; l++){
                        System.out.print(k-l);
                    }
                }
            }
            System.out.println();
        }
    }
}
