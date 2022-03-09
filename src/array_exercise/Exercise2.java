/*
Print true if the sum of any two number in the array matches the target, else print false.
 */
package array_exercise;

public class Exercise2 {
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,4};
        int target = 11;
        System.out.println(GetSumEqualsTarget(arr,target));
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
}
