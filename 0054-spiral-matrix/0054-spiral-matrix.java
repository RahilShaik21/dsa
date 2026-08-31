class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
          int m=matrix.length;
        int n=matrix[0].length;
        int left=0,right=n-1,top=0,bottom=m-1;
        List<Integer> arr=new ArrayList<>();
        //top
       while (left<=right&&top<=bottom){
           for (int i = left; i <= right; i++) {
               arr.add(matrix[top][i]);
           }
           top++;
           //right

           for (int i = top; i <= bottom; i++) {
               arr.add(matrix[i][right]);
           }
           right--;
           //bottom
           if(top<=bottom){
           for (int i = right; i >=left ; i--) {
               arr.add(matrix[bottom][i]);
           }
           bottom--;
           }
           //left
           if(left<=right){
           for (int i = bottom; i >=top ; i--) {
               arr.add(matrix[i][left]);
           }
           left++;
           }
       }
        
        return arr;
    }
}