class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        ArrayList<Integer> arr1=new ArrayList<>(4);
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                arr1.add(nums[j]);
            }
        }
        return arr1;
    }
}