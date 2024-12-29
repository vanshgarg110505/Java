import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,3,2,4};
        int unique = 0;
        for(int i : arr){
            unique ^= i; 
        }
        System.out.print(unique);
    }
}

/*
  Output :- 6 as it appears only once
*/
