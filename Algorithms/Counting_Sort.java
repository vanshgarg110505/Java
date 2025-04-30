import java.util.*;

public class Main {
  
    public static void countSort(int[] arr){
      if(arr.length == 0){
        return;
      }
      
      // find maximum element
      int max = arr[0];
      for(int i = 1 ; i < arr.length ; i++){
        if(arr[i] > max){
          max = arr[i];
        }
      }
      
      int countArray[] = new int[max + 1];
      for(int i = 0 ; i < arr.length ; i++){
        countArray[arr[i]]++;
      }
      
      int index = 0;
      for(int i = 0; i < countArray.length ; i++){
        while(countArray[i] > 0){
          arr[index++] = i;
          countArray[i]--;
        }
      }
    }
    
    public static void main(String[] args) {
      int arr[] = {4,3,12,1,5,5,3,9};
      countSort(arr);
      for(int i = 0 ; i < arr.length; i++){
        System.out.print(arr[i] + " ");
      }
    }
}
