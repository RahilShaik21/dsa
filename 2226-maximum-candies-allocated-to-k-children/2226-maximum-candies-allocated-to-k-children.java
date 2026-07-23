class Solution {
public int maximumCandies(int[] candies, long k) {
    int start=1;
   int end=candies[0];
    for (int i = 0; i < candies.length; i++) {
        if(candies[i]>end){
            end=candies[i];
        }
    }
   while(start<=end){
       int mid=start+(end-start)/2;
       if(isPossible(candies,mid,k)){
           start=mid+1;
       }
       else{
           end=mid-1;
       }
   }
   return end;
}
public  boolean isPossible(int[] nums,long sol,long k){
    long ans=0;
    for (int i = 0; i < nums.length; i++) {

        if(nums[i]/sol<1){
         continue;
        }
        else{
            ans=ans+ nums[i]/sol;
        }
    }
    return ans>=k;
}
}