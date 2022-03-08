package testfunction.trianglefunctions;

public class TrianglePrint17 {
    public static void PrintingTriangle17(int n){
        int i, j;
        for(i = n; i >= 1 ; i--){
            for(j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle17(5);
    }
}
