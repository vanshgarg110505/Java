class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.add((long)num);
        }

        int operations = 0;
        while(minHeap.size() > 1 && minHeap.peek() < k){
            long x = minHeap.poll();
            long y = minHeap.poll();

            long newNum = x * 2 + y;

            minHeap.add(newNum);
            operations++;
        }
        return operations;
    }
}
