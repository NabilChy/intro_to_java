package loop_exercise.problem_4;

import java.util.Scanner;

public class PrintFactorial {
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int value = myObj.nextInt();

        for(int i = value - 1 ; i != 0; i--){
            value = value * i;
        }
        System.out.println(value);
    }
}
