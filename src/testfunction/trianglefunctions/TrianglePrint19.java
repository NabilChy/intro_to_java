package testfunction.trianglefunctions;

public class TrianglePrint19 {
    public static void PrintingTriangle19(int n){
        int i, j ,k ;

        for(i = 1; i <= n; i++){
            for(j = i; j < n; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for(i = n - 1; i >= 1; i--){
            for(j = i; j <= n - 1; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        PrintingTriangle19(5);
    }
}
