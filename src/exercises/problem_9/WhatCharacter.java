package exercises.problem_9;

public class WhatCharacter {
    public static void main(String[] args){
        char value = ')';

        if((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')){
            System.out.println("The character is an alphabet");
        }else if(value >= '0' && value <= '9'){
            System.out.println("The character is a digit");
        }else{
            System.out.println("It is a special character");
        }
    }
}
