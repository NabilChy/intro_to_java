package array_exercise.practice.exercise15;

public class ArrayElementRemove {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        arr = RemoveElement(arr , 3);

        System.out.println("After removal array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] RemoveElement(int[]arr, int pos){
        int i;
        for(i = pos - 1; i < arr.length - 1; i++){
            arr[i] = arr[i +1];
        }
        arr[arr.length-1] = 0;
        return arr;
    }
}
