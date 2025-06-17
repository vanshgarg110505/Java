class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < expression.length() ; i++){
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*'){
                String left = expression.substring(0,i);
                String right = expression.substring(i + 1);

                List<Integer> leftResults = diffWaysToCompute(left);
                List<Integer> rightResults = diffWaysToCompute(right);

                for(int a : leftResults){
                    for(int b : rightResults){
                        if(ch == '+'){
                            result.add(a + b);
                        }
                        else if(ch == '-'){
                            result.add(a - b);
                        }
                        else{
                            result.add(a * b);
                        }
                    }
                }
            }
        }
        if(result.isEmpty()){
            result.add(Integer.parseInt(expression));
        }
        return result;
    }
}
