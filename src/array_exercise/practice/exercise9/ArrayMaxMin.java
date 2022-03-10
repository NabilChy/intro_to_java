package array_exercise.practice.exercise9;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {45, 25, 22};
        GetMaxMin(arr);


    }

    public static void GetMaxMin(int[] arr){
        int[] arr1 = new int[2];
        int i, j;
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
        arr1[0] = arr[0];
        arr1[1] = arr[arr.length -1];

        System.out.println("The maximum is: " + arr1[0]);
        System.out.println("The minimum is: " + arr1[1]);
    }
}
