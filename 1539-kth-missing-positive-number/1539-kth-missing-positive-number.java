class Solution {
    public int findKthPositive(int[] nums, int k) {
         int s=0,e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int missing=nums[mid]-(mid+1);
            if(missing<k){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return k+e+1;  
    }
}