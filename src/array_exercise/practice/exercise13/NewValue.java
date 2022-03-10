package array_exercise.practice.exercise13;

public class NewValue {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,11};
        System.out.println("Existing array:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("After inserting new element:");
        arr = InsertValueSorted(arr, 8);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] InsertValueSorted(int[] arr, int value){
        int i,j;
        int[] arr1 = new int[arr.length+1];

        for(i =0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
        arr1[arr.length] = value;

        for(i = arr1.length -1; i >= 0; i--){
            for (j = i - 1; j >= 0; j--){
                if(arr1[i] < arr1[j]){
                    int temp = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }
        return arr1;
    }
}
