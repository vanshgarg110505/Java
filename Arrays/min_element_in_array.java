import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {11,3,9,12,18};
        System.out.print(min(arr));
    }
    static int min(int arr[]){
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
