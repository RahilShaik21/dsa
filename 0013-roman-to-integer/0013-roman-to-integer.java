class Solution {
    public int romanToInt(String s) {
       int count=0;
        int length=s.length();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            int current =getValue(c);
            if (i + 1 < length && current < getValue(s.charAt(i + 1))) {
                count -= current;
            } else {
                count += current;
            }
        }
        return count;
    }
    int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}