package array_exercise.practice.exercise16;

public class SecondLargestValue {
    public static void main(String[] args) {
        int[] arr ={10,2,9,1,9,4,6,9};
        System.out.println("The second largest value is: " + GetSecondLargest(arr));
    }

    public static int GetSecondLargest(int[] arr){
        int i, j;
        int value = 0;

        //Sort in descending order
        for (i = 0; i < arr.length; i++){
            for (j = i + 1; j < arr.length; j++){
                if (arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //Find the second-largest value.
        for(i = 0; i < arr.length; i++){
            if (arr[i+1] != arr[i]){
                value = arr[i+1];
                break;
            }
        }
        return value;
    }
}
