class Solution {
     public static int singleNonDuplicate(int[] nums) {

        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid%2==1){
                mid--;
            }
            if((nums[mid]^nums[mid+1])==0){
                start=mid+2;
            }
            else if((nums[mid]^nums[mid+1])!=0){
                end=mid;
            }
        }
        return nums[end];

    }
}