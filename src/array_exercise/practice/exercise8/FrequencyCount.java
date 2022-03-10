package array_exercise.practice.exercise8;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {25,12,23,25};
        int[] arr1 = GetFrequencyCount(arr);

        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i] + " occurs " + arr1[i] + " times.");
        }
    }

    public static int[] GetFrequencyCount(int[] arr){
        int count = 0; int i, j;
        int[] arr1 = new int[arr.length];


        // ---------------------------------------
        for (i = 0; i < arr.length; i++){
            for (j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    arr1[i] = count;
                }
            }
            count = 0;
        }
        return arr1;
    }
}
