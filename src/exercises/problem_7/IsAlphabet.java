package exercises.problem_7;

public class IsAlphabet {
    public static void main(String[] args){
        char value = '9';

        if((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')){
            System.out.println("Character is an alphabet.");
        }else{
            System.out.println("Character is not an alphabet.");
        }
    }
}
