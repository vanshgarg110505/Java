class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int r = mat.length;
        int c = mat[0].length;
        int rows[] = new int[r];
        for(int i = 0 ; i < r ; i++){
            int count = 0;
            for(int j = 0 ; j < c ; j++){
                if(mat[i][j] == 1){
                    count++;
                }
                else{
                    break;
                }
            }
            rows[i] = count;
        }

        Integer index[] = new Integer[r];
        for(int i = 0 ; i < r ; i++){
            index[i] = i;
        }

        Arrays.sort(index, (a,b) -> {
            if(rows[a] != rows[b]){
                return rows[a] - rows[b];
            }
            return a - b;
        });
        
        int result[] = new int[k];
        for(int i = 0 ; i < k ; i++){
            result[i] = index[i];
        }
        return result;
    }
}
