package exercises.problem_8;

public class VowelOrConsonant {
    public static void main(String[] args){
        char value = 'A';

        if(value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u'){
            System.out.println("The character is a vowel");
        }else if(value == 'A' || value == 'E' || value == 'I' || value == 'O' || value == 'U'){
          System.out.println("The character is a vowel");
        } else if((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')){
            System.out.println("The character is a consonant.");
        }else{
            System.out.println("The character is not an alphabet.");
        }
    }
}
