package exercises.problem_14;

public class CheckAngle {
    public static void main(String[]args){
        int angle1 = 30, angle2 = 90, angle3 = 60;
        int sum_angle  = angle1 + angle2 + angle3;

        if (sum_angle == 180){
            System.out.println("It is a valid triangle.");
        }else{
            System.out.println("It is NOT a valid triangle.");
        }
    }
}
