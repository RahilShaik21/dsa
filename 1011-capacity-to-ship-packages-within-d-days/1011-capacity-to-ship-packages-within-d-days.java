class Solution {
    public int shipWithinDays(int[] weights, int days) {
         int start=0;
        int end=0;
        int sum=0;
        int max=weights[0];
        for (int i = 0; i < weights.length; i++) {
            sum+=weights[i];
            if(max<weights[i]){
                max=weights[i];
            }
        }
        start=max;
        end=sum;
        while (start<end){
            int mid=start+(end-start)/2;
            boolean ans=Countdays(weights,mid,days);
            if(!ans){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
     public boolean Countdays(int[] nums,int minWeight,int target){
        int sum=0;
        int days=1;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sum>minWeight){
                sum=nums[i];
                days++;
            }
        }
        return days>target?false:true;
    }
}