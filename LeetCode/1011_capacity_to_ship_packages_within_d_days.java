class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for(int w : weights){
            low = Math.max(w, low);
            high += w;
        }

        while(low < high){
            int mid = low + (high - low) / 2;
            if(canShip(weights, days, mid)){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean canShip(int[] weights, int days, int capacity){
        int currentLoad = 0;
        int requiredDays = 1;
        for(int w : weights){
            if(currentLoad + w > capacity){
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad += w;
        }
        return requiredDays <= days;
    }
}
