package exercises.problem_21;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of units used: ");
        int unit = myObj.nextInt();
        double amt, total, surcharge;

        if (unit <= 50){
            amt = unit * 0.5;
        }else if(unit <= 150){
            amt = 25 + (unit - 50) * 0.75;
        }else if(unit <= 250){
            amt = 100 + (unit - 150) * 1.20;
        }else{
            amt = 220 + (unit - 250) * 1.50;
        }
        surcharge = amt * 0.20;
        total = amt + surcharge;
        System.out.println("Total: " + total);
    }
}
