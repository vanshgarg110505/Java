class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int removeCount = n * 5 / 100;

        int sum = 0;
        for(int i = removeCount ; i < n - removeCount ; i++){
            sum += arr[i];
        }

        int count = n - removeCount - removeCount;
        return (double)sum / count;
    }
}
