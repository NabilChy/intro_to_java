package loop_exercise.homework.problem_2;

public class ProblemTwo {
    public static void main(String[] args) {
        int n = 5;
        int i, j;

        for (i = 1; i <= n; i++){
            for (j = 1; j <= i; j++){
                if(i%2 != 0){
                    System.out.print("#");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
