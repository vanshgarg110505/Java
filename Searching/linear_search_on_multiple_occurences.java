import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[] = {3,2,1,8,8,9};
      int target = 8;
      ArrayList <Integer> result = linearSearch(arr, target);
      System.out.print(result);
    }
    
    static ArrayList <Integer> list = new ArrayList<>();
    
    static ArrayList <Integer> linearSearch(int[] arr, int target){
      for(int i = 0 ; i < arr.length ; i++){
        if(arr[i] == target){
          list.add(i);
        }
      }
      return list;
    }
} 
