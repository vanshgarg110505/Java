import java.util.*;

class Main {
    public static void main(String[] args) {
        String name = "Vansh";
        char target = 'n';
        System.out.print(search(name, target));
    }
    
    static boolean search(String str, int target){
        if(str.length() <= 0){
            return false;
        }
        for(int i = 0 ; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
