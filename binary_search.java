import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,12,13,16,19,21,25,26};
        int target = 25;
        int answer = binarySearch(arr, target);
        System.out.print(answer);
    }
    
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
