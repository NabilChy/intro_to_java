package testfunction.patternfunctions;

public class PatternPrint8 {
    public static void PrintingPattern8(int n){
        int i,j;
        for (i = 1; i <= n; i++){
            for (j = 1; j <= n; j++){
                if (j == 1 || j == n || i == 1 || i == n){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingPattern8(5);
    }
}
