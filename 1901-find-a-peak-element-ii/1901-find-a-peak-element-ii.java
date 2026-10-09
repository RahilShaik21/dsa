class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int s=0,e=cols-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int maxRow=getMaxInCol(mat,mid,rows);
            int left=(mid-1)>=0?mat[maxRow][mid-1]:-1;
            int right=(mid+1)<cols?mat[maxRow][mid+1]:-1;
            if(left<mat[maxRow][mid]&&right<mat[maxRow][mid]){
                return new int[]{maxRow,mid};
            } else if (left>mat[maxRow][mid]) {
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    int getMaxInCol(int[][]mat,int col,int n){
        int maxElement=mat[0][col];
        int maxIdx=0;
        for (int i = 0; i < n; i++) {
            if(maxElement<mat[i][col]){
                maxIdx=i;
                maxElement=mat[i][col];
            }
        }
        return maxIdx;
    }


}