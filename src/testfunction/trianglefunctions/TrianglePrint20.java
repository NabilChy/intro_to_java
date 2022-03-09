package testfunction.trianglefunctions;

public class TrianglePrint20 {
    public static void PrintingTriangle20(int n){
        int m = 1;
        int i , j, k;

        for(i = 1; i <= n; i++){
            for(j = i; j < n; j++){
                System.out.print("  ");
            }

            for(k = 1; k <= m ; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
            m = m + 2;
        }
    }

    public static void main(String[] args) {
        PrintingTriangle20(5);
    }
}
