package testfunction.trianglefunctions;

public class TrianglePrint21 {
    public static void PrintingTriangle21(int n){
        int i, j ,k;

        for(i = n; i >= 1; i--){
            for(j = i; j < n; j++){
                System.out.print(" ");
            }
            for( k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(i = 2; i <= n; i++){
            for(j = i; j < n; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle21(5);
    }
}
