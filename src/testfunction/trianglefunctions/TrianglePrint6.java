package testfunction.trianglefunctions;

public class TrianglePrint6 {
    public static void PrintingTriangle6(int n){
        int i, j;
        for (i = n; i >= 1; i--){
            for (j = 5; j >= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle6(5);
    }
}
