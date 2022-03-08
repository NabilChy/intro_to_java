package testfunction.trianglefunctions;

public class TrianglePrint18 {
    public static void PrintingTriangle18(int n){
        int i, j, k;

        for(i = n; i >= 1; i--){
            for(j = i; j < n; j++){
                System.out.print(" ");
            }

            for(k = 1; k <= i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle18(5);
    }
}
