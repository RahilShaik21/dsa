class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        if(mat.length==1){
            return mat[0][0];
        }
        for (int i = 0; i < mat.length; i++) {

           sum+=mat[i][i];
                if(mat.length%2==1&&i==(mat.length+1)/2){
                    int idx=(mat.length+1)/2;
                   sum-=mat[idx-1][idx-1];
                }
                sum+=mat[i][mat.length-i-1];
        }
        return sum;
    }
}