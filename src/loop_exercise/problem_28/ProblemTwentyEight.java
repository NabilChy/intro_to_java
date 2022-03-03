package loop_exercise.problem_28;

public class ProblemTwentyEight {
    public static void main(String[] args) {
        int n = 4;
        int i, j;
        int m = 1;

        for (i = 65; i <= n + 65; i++){
            char a = (char)i;
            System.out.print(a);
            if(i == n + 65){
                for(j = n - 1 + 65; j >= 65; j--){
                    a = (char)j;
                    System.out.print(a);
                }
            }
        }
        System.out.println();
        for(i = n; i > 0; i--){
            for(j = 65; j <= i + 64; j++){
                char a =(char)j;
                System.out.print(a);
            }

            for(j = 1; j <= m; j++){
                System.out.print(" ");
            }
            m = m + 2;

            for(j = i + 64; j >= 65; j--){
                char a = (char)j;
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
