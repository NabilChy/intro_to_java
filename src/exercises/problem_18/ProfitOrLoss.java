package exercises.problem_18;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input cost price: ");
        int cost_price = myObj.nextInt();

        System.out.println("Input selling price: ");
        int selling_price = myObj.nextInt();

        if(selling_price > cost_price){
            System.out.println("Profit: " + (selling_price - cost_price));
        }else if(selling_price < cost_price){
            System.out.println("Loss: " + (selling_price - cost_price));
        }else{
            System.out.println("There has been no profit or gain.");
        }
    }
}
