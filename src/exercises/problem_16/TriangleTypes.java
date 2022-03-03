package exercises.problem_16;

public class TriangleTypes {
    public static void main(String[] args){

        int a = 30, b = 10, c = 40;

        if( a == b && b == c){
            System.out.println("It is an equilateral triangle.");
        }else if(a == b || a == c || c == b){
            System.out.println("It is an isosceles triangle.");
        }else{
            System.out.println("It is a scalene triangle.");
        }
    }
}
