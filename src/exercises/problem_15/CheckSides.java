package exercises.problem_15;

public class CheckSides {
    public static void main(String[] args){
        int a = 5, b = 8, c = 1;

        if((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("It is a valid triangle.");
        }else{
            System.out.println("It is NOT a valid triangle.");
        }
    }
}
