package loop_exercise.problem_10;

public class AnotherTriangleOne {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;  i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
