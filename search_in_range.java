import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {18,12,-7,3,14,28};
        int target = 3;
        System.out.print(search(arr, target, 1, 4));
    }
    
    static int search(int arr[], int target, int start, int end){
        if(arr.length <= 0){
            return -1;
        }
        for(int i = start ; i <= end ; i++){
            int element = arr[i];
            if(target == element){
                return i;
            }
        }
        return -1;
    }
}
/*
  Input :- 14
  Output :- 4

  Input :- 28
  Output :- -1  --> Outside the range
*/
