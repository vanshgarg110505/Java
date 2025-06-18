class Solution {
    public String minWindow(String s, String t) {
        int target[] = new int[128];
        for(char c : t.toCharArray()){
            target[c]++;
        }

        int left = 0, right = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        while(right < s.length()){
            char r = s.charAt(right);
            if(target[r] > 0){
                count--;
            }
            target[r]--;
            right++;

            while(count == 0){
                if(right - left < minLen){
                    minLen = right - left;
                    minStart = left;
                }

                char l = s.charAt(left);
                target[l]++;

                if(target[l] > 0){
                    count++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
