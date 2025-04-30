import java.util.*;

public class Main {
  // function to get maximum value in arr
  public static int getMax(int arr[]){
    int max = arr[0];
    for(int i = 1 ; i < arr.length ; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }
  
  // function to do counting sort based on the digit represented by exp 
  public static void countingSort(int[] arr, int exp){
    int n = arr.length;
    int output[] = new int[n]; // output array
    int count[] = new int[10]; // because digits range from 0 to 9
    
    // store count of occurences in count[]
    for(int i = 0 ; i < n ; i++){
      count[(arr[i] / exp) % 10]++;
    }
    
    // change count[i] so that count[i] contains actual position of this digit in output[]
    for(int i = 1 ; i < 10 ; i++){
      count[i] = count[i - 1] + count[i];
    }
    
    // build the output array (stable sort by traversing from right to left)
    for(int i = n - 1 ; i >= 0 ; i--){
      int digit = (arr[i] / exp) % 10;
      output[count[digit] - 1] = arr[i];
      count[digit]--;
    }
    
    // copy output[] to arr[]
    for(int i = 0 ; i < n ; i++){
      arr[i] = output[i];
    }
  }
  
  // main function to that sorts arr[] using radix sort 
  public static void radixSort(int arr[]){
    int max = getMax(arr);
    
    // do counting sort for every digit (exp = 1, 10, 100, ...)
    for(int exp = 1 ; max / exp > 0 ; exp *= 10){
      countingSort(arr, exp);
    }
  }
  
  public static void main(String[] args) {
    int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
    System.out.println("Before Sort :- " + Arrays.toString(arr));
    radixSort(arr);
    System.out.println("After Sort :- " + Arrays.toString(arr));
  }
}
