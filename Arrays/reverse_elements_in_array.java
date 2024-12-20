import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {11,3,9,12,18};
        rev(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void rev(int arr[]){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
}
