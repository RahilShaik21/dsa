class Solution {
    public void moveZeroes(int[] nums) {
         int p=0;
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[p]=nums[i];
                p++;
            }else{
                count++;
            }
        }
        for (int i = p; i < nums.length ; i++) {
            nums[i]=0;
        }
    }
}