package testfunction.trianglefunctions;

public class PatternPrint {
    public static void PrintingPattern(int value){
        for (int i = 1; i <= value; i++){
            for (int j = 1; j <= i; j++){
                if(i%2 != 0){
                    System.out.print("*");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintingPattern(10);
    }
}


