class Solution {
    public int search(int[] nums, int k) {
        int s=0,e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==k) return mid;
            if(nums[mid]==nums[s]&&nums[mid]==nums[e]){
                s++;
                e--;
                continue;
            }
            if(nums[s]<=nums[mid]){
                if(nums[s]<=k&&nums[mid]>k){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
            else{
                if(nums[e]>=k&&nums[mid]<k){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }

        }
        return -1;
    }
}