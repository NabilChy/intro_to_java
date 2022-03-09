package array_exercise.practice.exercise3;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {2,5,8};
        System.out.println(GetSum(arr));
    }

    public static int GetSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.print("Sum of all elements in the array is : ");
        return sum;
    }
}
