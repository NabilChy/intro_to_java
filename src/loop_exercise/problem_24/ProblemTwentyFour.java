package loop_exercise.problem_24;

public class ProblemTwentyFour {
    public static void main(String[] args) {
        int n = 8;
        int l = 64;
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                l = l + 1;
                char a =(char)l;
                System.out.print(a + " ");
                if( l == 90){
                    l = 64;
                }
            }

            System.out.println();
        }
    }
}
