class Solution {
    public int findNumbers(int[] nums) {
        int ev_count=0;
        for (int i = 0; i < nums.length; i++) {
            int count= (int) Math.floor((double)Math.log10((double)nums[i]));
            if(count%2==1){
                ev_count++;
            }
        }
        return ev_count;
    }
}