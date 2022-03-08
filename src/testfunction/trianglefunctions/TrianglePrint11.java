package testfunction.trianglefunctions;

public class TrianglePrint11 {
    public static void PrintingTriangle11(int n){
        int i, j, k;

        for (i = n; i >= 1; i--){
            for(j = i; j < n; j++){
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle11(5);
    }
}
