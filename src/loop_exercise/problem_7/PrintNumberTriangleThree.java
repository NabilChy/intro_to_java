package loop_exercise.problem_7;

public class PrintNumberTriangleThree {
    public static void main(String[] args) {
        int n = 5;
        int k = n;
        for(int i = 1; i <= k; i++){
            for(int j = n; j >= 1; j--){
                System.out.print(j + " ");
            }
            n--;
            System.out.println();
        }
    }
}

