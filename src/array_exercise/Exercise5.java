package array_exercise;
// Swap positions at the given position.
public class Exercise5 {
    public static void main(String[] args) {
        int[] arr = {10,11,34,5,6,1,7,8};
        arr = SwapPositions(arr, 3);
        System.out.println("After swapping:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] SwapPositions(int[] arr, int pos){
        int[] arr1 = new int[pos];
        int i,j;
        for(i = 0; i < pos; i++){
            arr1[i] = arr[i];
        }

        for (i = pos, j = 0; i < arr.length; i++){
            arr[j++] = arr[i];

        }

        for (i = arr.length - pos,j = 0; i < arr.length; i++){
            arr[i] = arr1[j++];
        }
        return arr;
    }
}
