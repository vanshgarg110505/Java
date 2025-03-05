class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            stack.push(c);

            if(stack.size() >= 3){
                int n = stack.size();
                if(stack.get(n-3) == 'a' && stack.get(n-2) == 'b' && stack.get(n-1) == 'c'){
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
