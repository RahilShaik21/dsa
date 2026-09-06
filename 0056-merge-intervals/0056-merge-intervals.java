
      import java.util.*;

class Solution {
    public int[][] merge(int[][] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] currentInterval = arr[0];
        result.add(currentInterval);

        for (int[] interval : arr) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                result.add(currentInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
