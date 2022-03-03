package loop_exercise.homework.problem_7;

public class ProblemSeven {
    public static void main(String[] args) {
        int n = 5;
        int i, j;

        for(i = 1; i <= n; i++){
            for(j = 1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
