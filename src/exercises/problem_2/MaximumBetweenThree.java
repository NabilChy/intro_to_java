package exercises.problem_2;

public class MaximumBetweenThree {
    public static void main(String[] args){

        int num1= 1, num2=2, num3=3;

        if(num1 > num2 && num1 > num3){
            System.out.println("Maximum is: " + num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("Maximum is: " + num2);
        }else if(num3 > num1 && num3 > num2){
            System.out.println("Maximum is: " + num3);
        }
    }
}
