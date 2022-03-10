package array_exercise.practice.exercise6;

public class ArrayUnique {
    public static void main(String[] args) {
        int[] arr ={2,1,1,3,4,3,1};
        System.out.println("The Unique elements are: ");
        GetUniqueElement(arr);
    }

    public static void GetUniqueElement(int[] arr){
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        int i, j;

        for(i = 0; i < arr.length; i++){
            for (j = 0; j < arr.length; j++){
                if((i != j) && (arr[i] == arr[j]) && (arr1[i] != arr[j])){
                    arr1[i] = arr[i];
                }
            }
        }

        for (i = 0; i < arr.length; i++){
            if (arr1[i] != arr[i]){
                arr2[i] = arr[i];
                System.out.println(arr2[i]);
            }
        }
    }
}
