package array_exercise;

public class Exercise7 {
    public static void main(String[] args) {
        int[] arr = {10,15,23,29,40,399};
        System.out.println(binarySearch(arr,15));
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0, right = arr.length -1;
        if (arr == null) return -1;

        while(left <= right){
            int mid = (left + right)/2;

            if(arr[mid] == target) return mid;

            else if (arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
