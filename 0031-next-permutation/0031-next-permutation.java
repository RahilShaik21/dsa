class Solution {
    public void nextPermutation(int[] nums) {
         int idx=-1;
        int n=nums.length;
        for (int i = n-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1) {
           int l=0,r=n-1;
           while(l<r){
               
                   int temp=nums[l];
                   nums[l]=nums[r];
                   nums[r]=temp;
               l++;
               r--;
           }
           return;
        }
        for (int i = n-1; i >0; i--) {
            if(nums[i]>nums[idx]){
                int temp=nums[idx];
                nums[idx]=nums[i];
                nums[i]=temp;
                break;
            }
        }
       int left =idx+1,right=n-1;
        while(left<right){

                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            left++;
            right--;
        }
    }
}