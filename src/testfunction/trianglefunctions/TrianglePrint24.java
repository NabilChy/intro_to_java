package testfunction.trianglefunctions;

public class TrianglePrint24 {
    public static void PrintingTriangle(int n){
        int i, j;
        for(i = 0; i <= n; i++){
            for(j = 65; j <= i + 65; j++){
                char a = (char)j;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
