package loop_exercise.Problem_8;

public class PrintReverseTriangle {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 5; j >= i; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
