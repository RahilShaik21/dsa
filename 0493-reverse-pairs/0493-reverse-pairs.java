class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
      public void merge(int[] arr, int low, int mid, int high) {
            // Create temp array
           
            List<Integer> temp = new ArrayList<>();
            int left = low, right = mid + 1;

            // Merge both sorted parts
            while (left <= mid && right <= high) {
                if (arr[left] <= arr[right])
                    temp.add(arr[left++]);
                else
                    temp.add(arr[right++]);
                   
            }

            // Add remaining left elements
            while (left <= mid)
                temp.add(arr[left++]);

            // Add remaining right elements
            while (right <= high)
                temp.add(arr[right++]);

            // Copy back to original array
            for (int i = low; i <= high; i++)
                arr[i] = temp.get(i - low);
        }

public int countrev(int[] arr,int low,int mid,int high){
    int right=mid+1;
    int cnt=0;
    for(int i=low;i<=mid;i++){
        while(right<=high&&arr[i]>2L*arr[right]) right++;
        cnt+=right-(mid+1);
    }
    return cnt;
}
        // Recursive merge sort
        public int mergeSort(int[] arr, int low, int high) {
        int cnt=0;
            if (low >= high)
                return cnt;

            // Find mid index
            int mid = (low + high) / 2;

            // Sort left half
           cnt+= mergeSort(arr, low, mid);

            // Sort right half
            cnt+=mergeSort(arr, mid + 1, high);
            cnt+=countrev(arr,low,mid,high);
            // Merge both halves
            merge(arr, low, mid, high);
            return cnt;
        }
    
}