/*
Print true if the sum of any two number in the array matches the target, else print false.
And find and print average
 */
package array_exercise;

public class Exercise2 {
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,4};
        int target = 11;
        System.out.println(GetSumEqualsTarget(arr,target));
        System.out.println(GetAverage(arr));
    }

    public static boolean GetSumEqualsTarget(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0 ; j < arr.length; j++){
                if ((arr[i] + arr[j] == target) && (i != j)){
                    return true;
                }
            }
        }

        return false;
    }

    public static int GetAverage(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return  (sum / arr.length);
    }
}
