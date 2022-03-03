package exercises.problem_12;

public class NumberOfDays {
    public static void main(String[] args){

        int month = 0;
        int days_1 = 31, days_2 = 28, days_3 = 29, days_4 = 30;

        if(month == 1){
            System.out.println("It contains " + days_1 + " days.");
        }else if (month == 2){
            System.out.println("It contains " + days_2 + "/" + days_3 + " days.");
        }else if(month == 3){
            System.out.println("It contains " + days_1 + " days.");
        }else if(month == 4){
            System.out.println("It contains " + days_4 + " days.");
        }else if(month == 5){
            System.out.println("It contains " + days_1 + " days.");
        }else if (month == 6){
            System.out.println("It contains " + days_4 + " days.");
        }else  if (month == 7){
            System.out.println("It contains " + days_1 + " days.");
        }else if(month == 8){
            System.out.println("It contains " + days_1 + " days.");
        }else if(month == 9){
            System.out.println("It contains " + days_4 + " days.");
        }else if(month == 10){
            System.out.println("It contains " + days_1 + " days.");
        }else if(month == 11){
            System.out.println("It contains " + days_4 + " days.");
        }else if(month == 12){
            System.out.println("It contains " + days_1 + " days.");
        }else{
            System.out.println("Not a valid month number");
        }
    }
}
