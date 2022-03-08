package testfunction.trianglefunctions;

public class TrianglePrint10 {
    public static void PrintingTriangle10(int n){
        int i, j, k;

        for(i = 1; i <= n; i++){
            for(j = i;  j < n; j++){
                System.out.print(" ");
            }
            for(k = 1; k <=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle10(5);
    }
}
