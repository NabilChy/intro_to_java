package array_exercise.practice.exercise10;

public class OddAndEven {
    public static void main(String[] args) {
        int[] arr = {25, 47, 42, 56, 32};
        int[] arrEven = GetEven(arr);
        int[] arrOdd = GetOdd(arr);
        System.out.println("The even numbers are: ");
        for(int i = 0; i < arrEven.length; i++){
            System.out.println(arrEven[i]);
        }

        System.out.println("The odd numbers are: ");
        for(int i = 0; i < arrOdd.length; i++){
            System.out.println(arrOdd[i]);
        }
    }

    public static int[] GetEven(int[] arr){
        int[] arr1 = new int[arr.length];
        for(int i = 0, j = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                arr1[j++] = arr[i];
            }
        }

        return arr1;
    }

    public static int[] GetOdd(int[] arr){
        int[] arr1 = new int[arr.length];
        for(int i = 0, j = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                arr1[j++] = arr[i];
            }
        }

        return arr1;
    }
}
