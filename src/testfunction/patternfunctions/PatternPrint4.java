package testfunction.patternfunctions;

public class PatternPrint4 {
    public static void PrintingPattern4(int n){
        int i, j;

        for (i = 1; i <= n; i++){
            for (j = 1; j <= n; j++){
                if((i%2 != 0 && j%2 != 0) ||
                        (i%2 == 0 && j%2 == 0)){
                    System.out.print("*");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingPattern4(5);
    }
}
