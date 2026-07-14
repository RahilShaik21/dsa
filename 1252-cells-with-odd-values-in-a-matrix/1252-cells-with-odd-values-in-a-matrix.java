class Solution {
     public int oddCells(int m, int n, int[][] indices) {
         int[] rows=new int[m];
        int[] cols=new int[n];
        int count=0;
        for (int i = 0; i < indices.length; i++) {
           rows[indices[i][0]]+=1;
           cols[indices[i][1]]+=1;
        }
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < cols.length; j++) {
                int value=rows[i]+cols[j];
                if(value%2==1){
                    count++;
                }
            }
        }
    return count;
        }
}