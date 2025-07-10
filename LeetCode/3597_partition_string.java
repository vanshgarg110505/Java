class Solution {
    public List<String> partitionString(String s) {
        Set<String> seen = new HashSet<>();
        List<String> result = new ArrayList<>();
        StringBuilder segment = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            segment.append(s.charAt(i));
            String current = segment.toString();
            if(!seen.contains(current)){
                seen.add(current);
                result.add(current);
                segment.setLength(0);
            }
        }
        return result;
    }
}
