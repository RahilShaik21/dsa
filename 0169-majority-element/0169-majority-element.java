class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
         int el=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            if(count==0){
                el=nums[i];
                count++;
            }else if(nums[i]==el){
                count++;
            }else{
                count--;
            }
        }
        int c1=0;
        for (int i = 0; i <n; i++) {
            if(el== nums[i]){
                c1++;
            }
        }
        
    return c1>n/2?el:-1;
    }
}