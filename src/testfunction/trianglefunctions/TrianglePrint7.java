package testfunction.trianglefunctions;

public class TrianglePrint7 {
    public static void PrintingTriangle7(int n){
        int i, j;
        for (i = 1; i <= n; i++){
            for (j = 5; j >= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle7(5);
    }
}
