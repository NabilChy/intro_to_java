package exercises.problem_19;

import java.util.Scanner;

public class GradePercentage {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the 5 grades: ");

        float phy = myObj.nextFloat();
        float chem = myObj.nextFloat();
        float bio = myObj.nextFloat();
        float math = myObj.nextFloat();
        float comp = myObj.nextFloat();

        float per = (phy + chem + bio + math + comp) / 5;
        System.out.println("Percentage: " + per);

        if(per >= 90){
            System.out.println("Grade A");
        }else if(per >= 80){
            System.out.println("Grade B");
        }else if(per >= 70){
            System.out.println("Grade C");
        }else if(per >= 60){
            System.out.println("Grade D");
        }else if(per >= 40){
            System.out.println("Grade E");
        }else if(per < 40){
            System.out.println("Grade F");
        }
    }
}
