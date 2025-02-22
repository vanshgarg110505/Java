class Solution {
    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    public String buildString(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch != '#'){
                stack.push(ch);
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for(char ch : stack){
            result.append(ch);
        }
        return result.toString();
    }
}
