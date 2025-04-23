class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();

        for(int i = 0 ; i <= s.length() - 10; i++){
            String substring = s.substring(i, i + 10);
            if(!seen.add(substring) && repeated.add(substring)){
                result.add(substring);
            }
        }
        return result;
    }
}
