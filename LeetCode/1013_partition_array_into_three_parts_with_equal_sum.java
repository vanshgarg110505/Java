class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;
        for(int num : arr){
            totalSum += num;
        }

        if(totalSum % 3 != 0){
            return false;
        }

        int target = totalSum / 3;
        int count = 0, sum = 0;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            sum += arr[i];
            if(sum == target){
                count++;
                sum = 0;
            }

            if(count == 2){
                return true;
            }
        }
        return false;
    }
}
