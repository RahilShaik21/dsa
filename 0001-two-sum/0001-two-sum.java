class Solution {
    public int[] twoSum(int[] nums, int target) {
         int n=nums.length;
        int[][] ar=new int[n][2];
        for (int i = 0; i < nums.length; i++) {
            ar[i][0]=nums[i];
            ar[i][1]=i;
        }
        Arrays.sort(ar,(a,b)->Integer.compare(a[0],b[0]));
        int l=0;
        int r=nums.length-1;

        while (l<r){
            int s=ar[l][0]+ar[r][0];
            if(s<target){
                l++;
            }
            else if(s>target){
                r--;
            }else{
                return new int[]{ar[l][1],ar[r][1]};
            }

        }
        return new int[]{-1,-1};
    }
}