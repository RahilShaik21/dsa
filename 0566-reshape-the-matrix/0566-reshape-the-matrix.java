class Solution {
     public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        int[][] newMat=new int[r][c];
        int i1=0;
        int j1=0;
            
        for (int k = 0; k < mat.length; k++) {
            for (int l = 0; l < mat[k].length; l++) {
                newMat[i1][j1]=mat[k][l];
                j1++;
                if(j1==c){
                    i1++;
                    j1=0;
                }
            }
        }
        
        return newMat;
    }
}