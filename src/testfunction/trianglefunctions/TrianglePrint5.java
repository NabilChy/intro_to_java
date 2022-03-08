package testfunction.trianglefunctions;

public class TrianglePrint5 {
    public static void PrintingTriangle5(int n){
        int i, j;
        for (i = n; i >= 1; i--){
            for (j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle5(5);
    }
}
