class Solution {
    public List<Integer> majorityElement(int[] nums) {
          int n=nums.length;
    int el1 = Integer.MIN_VALUE,el2=Integer.MIN_VALUE,c1=0,c2=0;
        for (int i = 0; i < nums.length; i++) {
            if(c1==0&&nums[i]!=el2){
                c1=1;
                el1=nums[i];
            } else if (c2==0&&nums[i]!=el1) {
                c2=1;
                el2=nums[i];
            }else if(nums[i]==el1){
                c1++;}
            else if(nums[i]==el2) {c2++;}
            else{
                c1--;
                c2--;
            }
        }
        int c11=0,c22=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==el1){
                c11++;
            }if(nums[i]==el2){
                c22++;
            }
        }
        ArrayList<Integer> arr=new ArrayList<>();
    if(c11>=n/3+1){
       arr.add(el1);
    }if(c22>=n/3+1){
        arr.add(el2);
        }
    return arr;
    }
}