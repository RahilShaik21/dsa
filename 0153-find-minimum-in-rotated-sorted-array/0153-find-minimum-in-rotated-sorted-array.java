class Solution {
    public int findMin(int[] arr) {
        int s=0,e=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[s]<=arr[mid]){
                ans=Math.min(ans,arr[s]);
                s=mid+1;
            }else{
                    ans=Math.min(ans,arr[mid]);
                    e=mid-1;
            }
        }
        return ans;
    }
}