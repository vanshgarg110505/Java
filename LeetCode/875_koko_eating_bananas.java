class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 , high = getMax(piles);

        while(low < high){
            int mid = low + (high - low) / 2;
            if(canEatAll(piles, mid, h)){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        } 
        return low;
    }

    public int getMax(int nums[]){
        int max = 0;
        for(int num : nums){
            max = Math.max(max, num);
        }
        return max;
    }

    public boolean canEatAll(int piles[], int k, int h){
        int hours = 0;
        for(int pile : piles){
            hours += (int)Math.ceil((double)pile / k);
        }
        return hours <= h;
    }
}
