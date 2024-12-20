import java.util.*;
class Main {
    public static void main(String[] args) {
        int[][]arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 16;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][]arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;
        int left = 0;
        int right = rows * cols - 1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            int midValue = arr[mid/cols][mid%cols];
            if(midValue == target){
                return new int[]{mid/cols, mid%cols};
            }
            else if(midValue < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}
