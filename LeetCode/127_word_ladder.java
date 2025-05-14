class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if(!wordSet.contains(endWord)){
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int k = 0 ; k < size ; k++){
                String word = queue.poll();
                char chars[] = word.toCharArray();

                for(int i = 0 ; i < chars.length ; i++){
                    char originalChar = chars[i];

                    for(char c = 'a' ; c <= 'z' ; c++){
                        if(c == originalChar){
                            continue;
                        }

                        chars[i] = c;
                        String nextWord = new String(chars);
                        if(nextWord.equals(endWord)){
                            return level + 1;
                        }

                        if(wordSet.contains(nextWord)){
                            queue.add(nextWord);
                            wordSet.remove(nextWord);
                        }
                    }
                    chars[i] = originalChar;
                }
            }
            level++;
        }
        return 0;
    }
}
