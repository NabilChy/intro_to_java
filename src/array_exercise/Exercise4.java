package array_exercise;
// Reverse array starting from specified position.
public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {10,11,34,5,6,1};
        System.out.println("Before swapping:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = GetReverseArray(arr, 3);
        System.out.println("After swapping:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] GetReverseArray(int[] arr, int pos){
        int i = pos;
        int j =  arr.length - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
