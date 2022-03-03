package exercises.problem_1;

public class MaximumBetweenTwo {
    public static void main(String[] args){


        int num1 = 30, num2=30;

        if(num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        }else if(num1 < num2){
            System.out.println(num2 + " is greater than " + num1);
        }else if(num1 == num2){
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
