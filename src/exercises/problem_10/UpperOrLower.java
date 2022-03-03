package exercises.problem_10;

public class UpperOrLower {
    public static void main(String[] args){
        char value  = '1';

        if(value >= 'a' && value <= 'z'){
            System.out.println("It is a lower case character.");
        }else if(value >= 'A' && value <= 'Z'){
            System.out.println("It is an upper case character.");
        }else{
            System.out.println("It is not an alphabet.");
        }
    }
}
