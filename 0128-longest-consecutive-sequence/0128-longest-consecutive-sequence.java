class Solution {
    public int longestConsecutive(int[] nums) {
         HashSet<Integer> set=new HashSet<>();
if(nums.length==0) return 0;
        int mc=1;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int val=num;
                int c=1;
                while(set.contains(num+1)){
                    num++;
                    c++;
                }
                mc=Math.max(mc,c);
            }
        }
        return mc;
    }
}