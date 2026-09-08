class Solution {
    public static int[] searchRange(int[] nums, int target) {
        return new int[]{firstOcc(nums,target),lastOcc(nums,target)};
    }
    static int firstOcc(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        int first=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                first=mid;
                e=mid-1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return first;
    }
    static int lastOcc(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        int last=-1;

        while (s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                last=mid;
                s=mid+1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return last;
    }

}