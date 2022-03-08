package testfunction.trianglefunctions;

public class TrianglePrint9 {
    public static void PrintingTriangle9(int n){
        int i, j;

        for (i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle9(5);
    }
}
