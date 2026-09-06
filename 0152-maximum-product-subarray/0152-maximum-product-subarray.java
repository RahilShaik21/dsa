class Solution {
    public int maxProduct(int[] nums) {
           int sfx=1;
        int prfx=1;
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for (int i = 0; i <n ; i++) {
            if(prfx==0) prfx=1;
            if(sfx==0) sfx=1;
            sfx*=nums[n-i-1];
            prfx*=nums[i];
            ans=Math.max(ans,Math.max(prfx,sfx));
        }
        return ans;
    }
}