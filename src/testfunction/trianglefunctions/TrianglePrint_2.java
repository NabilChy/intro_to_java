package testfunction.trianglefunctions;

public class TrianglePrint_2 {
    public static void PrintingTriangle2(int n){
        int i, j;

        for (i = 1; i <= n; i++){
            for (j = 1; j <= i; j++){
                if(i%2 != 0){
                    System.out.print("#");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle2(5);
    }
}
