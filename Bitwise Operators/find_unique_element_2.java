import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {-2,3,2,4,5,-5,-4};
        int sum = 0;
        for(int i : arr){
            sum += i; 
        }
        System.out.print(sum);
    }
}
