class Solution {
    public void rotate(int[] nums, int k) {
         k=k%(nums.length);
         if(nums.length<1){
            return;
         }
         int n=nums.length;
         revArr(nums,0,n-1);
         revArr(nums,0,k-1);
         revArr(nums,k,n-1);
        
    }
    public  void revArr(int[] arr,int start,int end){
      while(start<end){
          int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          start++;
          end--;
      }
    }
}