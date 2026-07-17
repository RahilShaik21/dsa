class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> arr=new ArrayList<>();
        
        for (int i = 0; i < matrix.length; i++) {
            int idx1=i;
            int idx2=0;
            int minRow=matrix[idx1][idx2];
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]<minRow){
                    minRow=matrix[i][j];
                    idx1=i;
                    idx2=j;
                }
            }
            if(checkMaxINColumn(matrix,idx1,idx2)){
                arr.add(minRow);
            };
        }
        return arr;
    }
    public boolean checkMaxINColumn(int[][] matrix,int idx1,int idx2){
        for (int i = 0; i < matrix.length ; i++) {
            if(matrix[idx1][idx2]<matrix[i][idx2]){
                return false;
            }
        }
        return true;
    }
}