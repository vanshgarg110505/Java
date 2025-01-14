class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];
        for(int i = 0 ; i < nums1.length; i++){
            ans[i] = nums1[i];
        }

        for(int i = 0; i < nums2.length ; i++){
            ans[nums1.length + i] = nums2[i];
        }

        Arrays.sort(ans);
        int n = ans.length;
        if(n%2==1){
            return ans[n/2];
        }
        else{
            return (ans[n/2-1]+ans[n/2])/2.0;
        }
    }
}
