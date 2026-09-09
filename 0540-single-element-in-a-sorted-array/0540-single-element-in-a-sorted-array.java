class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s=0,e=nums.length-1;
        if(nums.length==1) return nums[0];
        if(nums[s]!=nums[s+1]) return nums[s];
        if(nums[e]!=nums[e-1]) return nums[e];
        s+=1;
        e-=1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]) return nums[mid];
            if(mid%2==1&&nums[mid]==nums[mid-1]||mid%2==0&&nums[mid]==nums[mid+1]) s=mid+1;
            else e=mid-1;
        }
        return -1;
    }
}