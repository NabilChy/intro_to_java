package testfunction.trianglefunctions;

public class TrianglePrint23 {
    public static void PrintingTriangle23(int n){
        int i, j;
        for(i = n; i >= 0; i--){
            for(j = 65; j <= i + 65; j++){
                char a = (char)j;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
