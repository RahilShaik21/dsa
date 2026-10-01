class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n=mat.length,m=mat[0].length;
    int s=0,e=(n*m)-1;
    while(s<=e){
        int mid=s+(e-s)/2;
        int row=mid/m,col=mid%m;
        if(mat[row][col]==target) return true;
        if(mat[row][col]>target) e=mid-1;
        else s=mid+1;
    }
    return false;
    }
}