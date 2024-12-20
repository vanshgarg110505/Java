import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[][] = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int target = 34;
        int[] result = search(arr, target);
        if(result[0] == -1){
            System.out.print("Element not found");
        }
        else{
            System.out.print("Element found at row index " + result[0] + " and column index "+ result[1]);
        }
    }
    static int[] search(int[][]arr, int target){
         for(int i = 0 ; i < arr.length ; i++){
             for(int j = 0 ; j < arr[i].length ; j++){
                 if(arr[i][j] == target){
                     return new int[]{i,j};
                 }
             }
         }
         return new int[]{-1,-1};
    }
}
