import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {11,3,9,12,18};
        int target = 3;
        int result = linearSearch(arr, target);
        System.out.println(result);
    }
    static int linearSearch(int arr[], int target){
        if(arr.length <= 0){
            return -1;
        }
        for(int i = 0 ; i < arr.length ; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}


/*
  Output :- 1  (target 3 is found at index 1)
*/
