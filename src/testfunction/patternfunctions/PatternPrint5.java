package testfunction.patternfunctions;

public class PatternPrint5 {
    public static void PrintingPattern5(int n){
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

    public static void main(String[] args) {
        PrintingPattern5(5);
    }
}
