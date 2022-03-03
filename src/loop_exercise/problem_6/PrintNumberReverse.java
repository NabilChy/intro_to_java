package loop_exercise.problem_6;

public class PrintNumberReverse {
    public static void main(String[] args){
        int n = 5;
        int k = n;
        for(int i = 1;i <= k; i++){
            for(int j = 1;j <= n; j++){
                System.out.print(j);
                }
            n--;
            System.out.println();
            }
        }
    }

