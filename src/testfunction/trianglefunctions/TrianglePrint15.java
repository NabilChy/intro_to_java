package testfunction.trianglefunctions;

public class TrianglePrint15 {
    public static void PrintingTriangle15(int n){
        int i, j;

        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle15(5);
    }
}
