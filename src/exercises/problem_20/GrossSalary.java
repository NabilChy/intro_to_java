package exercises.problem_20;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input Basic salary of an employee: ");
        int basic_salary = myObj.nextInt();

        double da, hra;
        double gross_salary;

        if(basic_salary <= 10000){
            da = basic_salary * 0.8;
            hra = basic_salary * 0.2;
            gross_salary = basic_salary + da + hra;
            System.out.println("Gross Salary: " + gross_salary);
        }else if (basic_salary > 10000 && basic_salary <= 20000){
            da = basic_salary * 0.9;
            hra = basic_salary * 0.25;
            gross_salary = basic_salary + da + hra;
            System.out.println("Gross Salary: " + gross_salary);
        }else if (basic_salary >= 20001){
            da = basic_salary * 0.95;
            hra = basic_salary * 0.3;
            gross_salary = basic_salary + da + hra;
            System.out.println("Gross Salary: " + gross_salary);
        }

    }
}
