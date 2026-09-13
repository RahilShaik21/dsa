
class Solution {
    public int smallestDivisor(int[] nums, int limit) {
       int s=1,e=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>e) e=nums[i];
       }
       while(s<=e){
        int mid=s+(e-s)/2;
        long checkAns=getThresold(nums,mid);
        if(checkAns>limit){
            s=mid+1;  
        }
        else{
             e=mid-1;
        }
       }
       return s;
    }
    long getThresold(int[] nums,int mid){
        long ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=(nums[i] + mid - 1) / mid;
        }
        return ans;
    }
}