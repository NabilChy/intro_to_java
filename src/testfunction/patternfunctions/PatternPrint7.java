package testfunction.patternfunctions;

public class PatternPrint7 {
    public static void PrintingPattern7(int n){
        int l = 0;
        int i, j;

        for(i = 1; i <= n; i++){
            for(j = 1; j < n; j++){
                l = l +1;
                System.out.print(l);

                if(l == 9){
                    l = -1;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingPattern7(5);
    }
}
