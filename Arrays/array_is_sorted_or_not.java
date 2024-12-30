import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5};
      if(sorted(arr)){
        System.out.print("Array is sorted");
      }
      else{
        System.out.print("Array is not sorted");
      }
    }
    
    static boolean sorted(int[] arr){
      for(int i = 0 ; i < arr.length - 1 ; i++){
        if(arr[i] > arr[i+1]){
          return false;
        }
      }
      return true;
    }
} 
