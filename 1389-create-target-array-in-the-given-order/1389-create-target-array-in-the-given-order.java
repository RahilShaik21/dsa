import java.util.ArrayList;
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
         ArrayList<Integer> ans =new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            ans.add(index[i],nums[i]);
        }
        int[] a=new  int[nums.length];
        for (int i=0;i<nums.length;i++) {
            a[i]=ans.get(i);
        }
        return a;
    }
}