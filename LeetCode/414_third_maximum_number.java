class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int num : nums){
            set.add(num);
            if(set.size() > 3){
                set.pollLast();
            }
        }
        return set.size() == 3 ? set.last() : set.first();
    }
}
