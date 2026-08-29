class Solution {
    public int maxProfit(int[] nums) {
        int minVal=Integer.MAX_VALUE;
    int maxProf=0;
    for(int i=0;i<nums.length;i++){
        if(minVal>nums[i]){
            minVal=nums[i];
        }
        maxProf=Math.max(maxProf,nums[i]-minVal);
    }
    return maxProf;
    }
}