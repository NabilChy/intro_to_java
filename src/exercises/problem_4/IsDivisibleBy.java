package exercises.problem_4;

public class IsDivisibleBy {
    public static void main(String[] args){

        int num = 65;

        if(num % 5 == 0 && num % 11 == 0){
            System.out.println("The number is divisible by both 5 & 11");
        }else{
            System.out.println("The number is not divisible by both 5 & 11");
        }
    }
}
