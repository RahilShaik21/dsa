class Solution {
    public int searchInsert(int[] nums, int target) {
            int s=0,e=nums.length-1;
            int ans=0;
            if(nums[e]<target) return e+1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target) s=mid+1;
            else {
                ans=mid;
                e=mid-1;}
        }
        return ans;
    }
}