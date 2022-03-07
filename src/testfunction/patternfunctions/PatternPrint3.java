package testfunction.patternfunctions;

public class PatternPrint3 {
    public static void PrintingPattern3(int n){
        int i, j;

        for (i = 1; i < n; i++){
            for (j = 1; j <= n; j++){
                if(j%2 != 0){
                    System.out.print("*");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingPattern3(5);
    }
}
