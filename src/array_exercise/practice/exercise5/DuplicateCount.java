package array_exercise.practice.exercise5;

public class DuplicateCount {
    public static void main(String[] args) {
        int[] arr ={2,1,1,3,4,3,1};
        System.out.println("Duplicate Count " + GetDuplicateCount(arr));

    }

    public static int GetDuplicateCount(int[] arr){
        int[] arr1 = new int[arr.length];

        int count = 0;
        int inc = 1;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if((arr[i] == arr[j])){
                    arr1[j] = inc;
                    inc++;
                }
            }
            inc = 1;
        }

        for (int i = 0; i < arr.length; i++){
            if (arr1[i] == 2){
                count++;
            }
        }

        return count;
    }
}
