class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;
        for(int key : map.keySet()){
            if(map.containsKey(key + 1)){
                int currentLength = map.get(key) + map.get(key + 1);
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }
}
