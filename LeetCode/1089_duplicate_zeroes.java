class Solution {
    public void duplicateZeros(int[] arr) {
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < arr.length ; i++){
            queue.add(arr[i]);
            if(arr[i] == 0){
                queue.add(arr[i]);
            }
            arr[i] = queue.poll();
        }
    }
}
