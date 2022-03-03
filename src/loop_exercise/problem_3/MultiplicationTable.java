package loop_exercise.problem_3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int value = myObj.nextInt();
        int multiplication;
        for(int i = 0; i <= 10; i++){
            multiplication = value * i;
            System.out.println(value + " * " + i + " = " + multiplication);
        }
    }
}
