class Solution {
    public int[] sumZero(int n) {
        int[] num=new int[n];
        int in=-n/2;
        for (int i = 0; i < n; i++) {
            if(n%2==0){
                if(in==0){
                   in++;
                   num[i]=in;
                }
                num[i]=in;
                in++;
            }else{
            num[i]=in;
            in++;
            }
        }
        return num;
    }
}