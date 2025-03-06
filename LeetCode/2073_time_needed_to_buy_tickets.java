class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < tickets.length ; i++){
            queue.add(i);
        }

        int time = 0;

        while(tickets[k] != 0){
            int person = queue.poll();
            tickets[person]--;
            if(tickets[person] > 0){
                queue.add(person);
            }
            time++;
        }
        return time;
    }
}
