package array_exercise.practice.exercise17;

public class SecondSmallestValue {
    public static void main(String[] args) {
        int[] arr ={0,9,4,6,5};
        System.out.println("The second smallest value is: " +
                GetSecondSmallest(arr));
    }

    public static int GetSecondSmallest(int[] arr){
        int i, j, temp;
        int value = 0;
        //Sort in ascending order
        for (i = 0; i < arr.length; i++){
            for (j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //Find the second-smallest value.
        for(i = 0; i < arr.length; i++){
            if (arr[i+1] != arr[i]){
                value = arr[i+1];
                break;
            }
        }
        return value;
    }
}
