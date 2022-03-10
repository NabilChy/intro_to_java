package array_exercise.practice.exercise12;

public class ArraySortDescending {
    public static void main(String[] args) {
        int[] arr = {5,9,1};
        int[] arrDesc = GetSortDescending(arr);
        System.out.println("The elements in descending order: ");
        for (int i = 0; i < arrDesc.length; i++){
            System.out.println(arrDesc[i]);
        }
    }

    public static int[] GetSortDescending(int[] arr){
        int i, j;
        for (i = 0; i < arr.length; i++){
            for (j = i + 1; j < arr.length; j++){
                if (arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
