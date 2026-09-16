class Solution {
    public int splitArray(int[] nums, int k) {
        int s=Integer.MIN_VALUE,e=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>s) s=nums[i];
            e+=nums[i];
        }
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int subArr=getSubArray(nums,mid);
            if(subArr<=k){
                ans=mid;
                e=mid-1;
            }
            else{
                
                s=mid+1;
            }

        }
        return ans;
    }
    int getSubArray(int[] nums,int mid){
        int ans=1;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]+temp<=mid){
                temp+=nums[i];
            }
            else{
                ans++;
                temp=nums[i];
            }
        }
        return ans;
    }

}