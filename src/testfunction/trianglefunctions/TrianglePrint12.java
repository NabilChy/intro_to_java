package testfunction.trianglefunctions;

public class TrianglePrint12 {
    public static void PrintingTriangle12(int n){
        int i,j, k;

        for(i = 1; i <= n; i++){
            for(j = i; j < n; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print(k);
                if(k == 1){
                    ;
                }else if(k != 1 && k == i){
                    for(int l = 1; l < k; l++){
                        System.out.print(k-l);
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingTriangle12(5);
    }
}
