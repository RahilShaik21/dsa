class Solution {
    public int[] twoSum(int[] nums, int target) {
          int start=0;
        int end= nums.length-1;
        int[] ans=new int[2];
        while(start<end){
            int ans1=target-nums[start];
            int ans2=binarySearch(nums,ans1,start+1,end);
            if(ans2<0){
                start++;
            }else{
                ans[0]=start+1;
                ans[1]=ans2+1;
                break;
            }
        }
        return ans;
    }
    public int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}