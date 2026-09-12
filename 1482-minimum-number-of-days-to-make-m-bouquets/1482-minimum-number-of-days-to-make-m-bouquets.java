class Solution {
    public int minDays(int[] nums, int m, int k) {
        int s=Integer.MAX_VALUE,e=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(s>nums[i]) s=nums[i];
            if(e<nums[i]) e=nums[i];
        }
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int possibleBoukey=MakeBoukey(nums,k,mid);
            if(m<=possibleBoukey){
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
    public int MakeBoukey(int[] nums, int k,int minDays) {
        int count=0;
        int adjCount=0;
        for (int i = 0; i < nums.length; i++) {
            if(minDays>=nums[i]) {
                adjCount++;
            }
           if(nums[i]>minDays){
                count+=(adjCount/k);
               adjCount=0;
           }
           if(adjCount>=k){
              count+=(adjCount/k);
              adjCount=0;
          }

        }
        return count;
    }
}