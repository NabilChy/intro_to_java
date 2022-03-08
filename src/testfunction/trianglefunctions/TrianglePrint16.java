package testfunction.trianglefunctions;

public class TrianglePrint16 {
    public static void PrintingTriangle16(int n){
        int i ,j ,k;

        for(i = 1; i <= n; i++){
            for( j = i; j < n; j++){
                System.out.print(" ");
            }
            for( k = 1; k <= i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle16(5);
    }
}
