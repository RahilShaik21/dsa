/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        // Find peak
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        int temp = start;

        // Binary search in ascending part
        start = 0;
        end = temp;

        boolean found = false;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) > target) {
                end = mid - 1;
            } else if (arr.get(mid) < target) {
                start = mid + 1;
            } else {
                found = true;
                return mid;
            }
        }

        // Binary search in descending part
        if (!found) {
            start = temp + 1;
            end = arr.length() - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr.get(mid) > target) {
                    start = mid + 1;
                } else if (arr.get(mid) < target) {
                    end = mid - 1;
                } else {
                    found = true;
                    return mid;
                }
            }
        }

        return -1;
    }
}