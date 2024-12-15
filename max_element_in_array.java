import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1,3,9,12,18};
        System.out.print(max(arr));
    }
    static int max(int arr[]){
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
