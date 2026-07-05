class Solution {
    public int findKthPositive(int[] arr, int k) {
             int missingVal=0;
        int start=0;
        int end=arr.length-1;
        //here we are finding that where missing values are greater than the give k
        while (start<=end){
            int mid=start+(end-start)/2;
            missingVal=arr[mid]-(mid+1);//here we finding the mising values that exists
            // by subtarcting the actual value in the arr - the value that should exists there ie.index+1
            if(missingVal>=k){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start+k;
    }
    }