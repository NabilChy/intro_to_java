package testfunction.trianglefunctions;

public class TrianglePrint8 {
    public static void PrintingTriangle8(int n){
        int i, j;
        int k = 1;
        for (i = 1; i <= n; i++){
            for (j = 1; j <= i; j++){
                System.out.print(k + " ");
                k = k + 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle8(5);
    }
}
