package exercises.problem_17;

import static java.lang.Math.sqrt;

public class QuadraticRoots {
    public static void main(String[] args){
        int a = -8, b = -4, c = -2;
        double root1, root2, imaginary;
        double discriminant = (b^2) - (4*a*c);

        if (discriminant > 0){
            root1 = (-b + sqrt(discriminant)) / (2 * a);
            root2 = (-b - sqrt(discriminant)) / (2 * a);
            System.out.println("Root1: " + root1 + "\n" + "Root2: " + root2);
        }else if(discriminant == 0){
            root1 = root2 = -b / (2 * a);
            System.out.println("Root1: " + root1);
        }else{
            root1 = root2 = -b / (2 * a);
            imaginary = sqrt(-discriminant) / (2 * a);
            System.out.println("Root1: " + root1 + " + " + imaginary + "i");
            System.out.println("Root2: " + root2 + " + " + imaginary + "i");
        }
    }
}
