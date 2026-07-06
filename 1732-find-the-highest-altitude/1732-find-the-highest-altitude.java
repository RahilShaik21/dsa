class Solution {
    public int largestAltitude(int[] gain) {
        int peak=0;
        int highPeak=0;
        for (int i = 0; i < gain.length; i++) {
            peak+=gain[i];
            if(highPeak<peak){
                highPeak=peak;
            }
        }
        return highPeak;
    }
}