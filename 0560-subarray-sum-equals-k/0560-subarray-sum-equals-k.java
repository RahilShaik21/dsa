class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
    HashMap<Integer,Integer> h=new HashMap<>();
    int sum=0;
    h.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            int rem=sum-k;
            if(h.containsKey(rem)){
                c+=h.get(rem);
            }
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return c;
    }
}