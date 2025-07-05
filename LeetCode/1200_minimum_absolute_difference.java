class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        for(int i = 1 ; i < arr.length ; i++){
            int diff = arr[i] - arr[i-1];
            minDiff = Math.min(diff, minDiff);
        }

        for(int i = 1 ; i < arr.length ; i++){
            int diff = arr[i] - arr[i-1];
            if(minDiff == diff){
                result.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return result;
    }
}
