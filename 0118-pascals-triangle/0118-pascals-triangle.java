class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        for (int i=1;i<=numRows;i++){
            l.add(genRow(i));
        }
        return l;
    }
    List<Integer> genRow(int row){
        List<Integer> l=new ArrayList<>();
        int ans=1;
        l.add(ans);
        for (int i = 1; i < row; i++) {
            ans*=(row-i);
            ans/=i;
            l.add(ans);
        }
        return l;
    }
}