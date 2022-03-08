package testfunction.trianglefunctions;

public class TrianglePrint14 {
    public static void PrintingTriangle14(int n){
        int i, j, k;

        for(i = 1; i <= n; i++){
            for(j = i; j < n; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle14(5);
    }
}
