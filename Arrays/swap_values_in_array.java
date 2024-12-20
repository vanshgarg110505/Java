import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1,3,9,12,18};
        swap(arr, 1,3);
        System.out.print(Arrays.toString(arr));
    }
    static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

/*
    Output :- [1,12,9,3,18]
*/
