import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {31,27,23,22,20,16,14,13,12,10};
        int target = 27;
        int answer = orderAgnosticBinarySearch(arr, target);
        System.out.print(answer);
    }
    
    static int orderAgnosticBinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        
        boolean isAsc = arr[start] < arr[end];
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else if(target > arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
            
        }
        return -1;
    }
}
