import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[][] = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int result = min(arr);
        System.out.print(result);
    }
    static int min(int[][]arr){
        int min = arr[0][0];
         for(int i = 0 ; i < arr.length ; i++){
             for(int j = 0 ; j < arr[i].length ; j++){
                 if(arr[i][j] < min){
                     min = arr[i][j];
                 }
             }
         }
         return min;
    }
}
