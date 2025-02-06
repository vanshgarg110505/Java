class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
