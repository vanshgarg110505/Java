import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1,5,3,9,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = i + 1 ; j > 0 ; j--){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
