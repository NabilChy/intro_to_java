package testfunction.trianglefunctions;

public class TrianglePrint25 {
    public static void PrintingTriangle25(int n){
        int i, j, k;
        for (i = 0; i <= n; i++){
            for (j = i; j <= n; j++){
                System.out.print(" ");
            }
            for (k = 65; k <= i + 65; k++){
                char a =(char)k;
                System.out.print(a);
                if(k == 65){
                    ;
                }else if(k != 65 && k == i + 65){
                    for(int l = 65; l < k; l++){
                        int m = (k - l) + 64;
                        char b = (char)m;
                        System.out.print(b);
                    }
                }
            }
            System.out.println();
        }
    }
}
