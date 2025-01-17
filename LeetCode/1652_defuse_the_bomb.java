class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int result[] = new int[n];
        if(k == 0){
            return result;
        }
        int start, step;
        if(k > 0){
            start = 1;
            step = 1;
        }
        else{
            start = -1;
            step = -1;
            k = -k;
        }
        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int j = 1 ; j <= k ; j++){
                int index = (i + start * j + n) % n;
                sum += code[index];
            }
            result[i] = sum;
        }
        return result;
    }
}
